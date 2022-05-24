import antlr4 from "antlr4";
import SearchQueryLexer from "./parser/SearchQueryLexer";
import SearchQueryParser from "./parser/SearchQueryParser";
import TableGenerator from "./TableGenerator";
import searchContext from "./searchContext";

const errBlock = document.getElementById("error");
const textarea = document.getElementById("rawText");

const showError = (err) => {
  errBlock.innerHTML = err;
  errBlock.classList.remove("visually-hidden");
};

export let parse = () => {
  const chars = new antlr4.InputStream(textarea.value);
  const lexer = new SearchQueryLexer(chars);
  const tokens = new antlr4.CommonTokenStream(lexer);
  const parser = new SearchQueryParser(tokens);
  parser.buildParseTrees = true;
  searchContext.setError(null);
  parser.removeErrorListeners();
  parser.addErrorListener({
    syntaxError: (recognizer, offendingSymbol, line, column, msg, err) => {
      searchContext.setError(`line ${line}, col ${column}: ${msg}`);
    },
  });

  const tree = parser.searchEntry();
  const tableGenerator = new TableGenerator();
  antlr4.tree.ParseTreeWalker.DEFAULT.walk(tableGenerator, tree);
  searchContext.setHtmlData(tableGenerator.getTable());

  errBlock.classList.add("visually-hidden");
  if (searchContext.getError()) {
    textarea.classList.add("is-invalid");
    textarea.classList.remove("is-valid");
    showError(searchContext.getError());
    return;
  } else {
    textarea.classList.remove("is-invalid");
    textarea.classList.add("is-valid");
  }

  if (searchContext.getHtmlData()) {
    document.getElementById("tableWrapper").innerHTML = searchContext.getHtmlData();
  }
};
