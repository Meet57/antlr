import antlr4 from "antlr4";
import SearchQueryLexer from "./parser/SearchQueryLexer";
import SearchQueryParser from "./parser/SearchQueryParser";

export let parse = (input) => {
  const chars = new antlr4.InputStream(input);
  const lexer = new SimpleLogLexer(chars);
  const tokens = new antlr4.CommonTokenStream(lexer);
  const parser = new SimpleLogParser(tokens);
  parser.buildParseTrees = true;
  const tree = parser.logEntry();
  const tableGenerator = new TableGenerator();
  antlr4.tree.ParseTreeWalker.DEFAULT.walk(tableGenerator, tree);
  return tableGenerator.getTable();
};
