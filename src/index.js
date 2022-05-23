import antlr4 from "antlr4";
import SearchQueryLexer from "./parser/SearchQueryLexer";
import SearchQueryParser from "./parser/SearchQueryParser";
import TableGenerator from "./TableGenerator";

export let parse = (input) => {
  const chars = new antlr4.InputStream(input);
  const lexer = new SearchQueryLexer(chars);
  const tokens = new antlr4.CommonTokenStream(lexer);
  const parser = new SearchQueryParser(tokens);
  parser.buildParseTrees = true;

  
  const tree = parser.searchEntry();
  const tableGenerator = new TableGenerator();
  antlr4.tree.ParseTreeWalker.DEFAULT.walk(tableGenerator, tree);
  return tableGenerator.getTable();
};
