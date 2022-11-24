// This is a generated file. Not intended for manual editing.
package saha.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import saha.intellij.language.psi_node.*;

public interface SahaTypes {

  IElementType ATOM = new SahaElementType("ATOM");
  IElementType BRANCH_MARK = new SahaElementType("BRANCH_MARK");
  IElementType CHARSET = new SahaElementType("CHARSET");
  IElementType DEFINE = new SahaElementType("DEFINE");
  IElementType EXPORT_STATEMENT = new SahaElementType("EXPORT_STATEMENT");
  IElementType EXPR = new SahaElementType("EXPR");
  IElementType FIELD_MARK = new SahaElementType("FIELD_MARK");
  IElementType FIELD_RHS = new SahaElementType("FIELD_RHS");
  IElementType FUNCTION_CALL = new SahaElementType("FUNCTION_CALL");
  IElementType GRAMMAR_STATEMENT = new SahaElementType("GRAMMAR_STATEMENT");
  IElementType IDENTIFIER = new SahaElementType("IDENTIFIER");
  IElementType IMPORT_BODY = new SahaElementType("IMPORT_BODY");
  IElementType IMPORT_STATEMENT = new SahaElementType("IMPORT_STATEMENT");
  IElementType INFIX = new SahaElementType("INFIX");
  IElementType KEY = new SahaElementType("KEY");
  IElementType KEY_SYMBOL = new SahaElementType("KEY_SYMBOL");
  IElementType KW_IMPORT = new SahaElementType("KW_IMPORT");
  IElementType MACRO_ARG = new SahaElementType("MACRO_ARG");
  IElementType MACRO_CALL = new SahaElementType("MACRO_CALL");
  IElementType MACRO_STATEMENT = new SahaElementType("MACRO_STATEMENT");
  IElementType MODIFIERS = new SahaElementType("MODIFIERS");
  IElementType NAMESPACE = new SahaElementType("NAMESPACE");
  IElementType NUMBER_SUFFIX = new SahaElementType("NUMBER_SUFFIX");
  IElementType OBJECT = new SahaElementType("OBJECT");
  IElementType OBJECT_ITEM = new SahaElementType("OBJECT_ITEM");
  IElementType OBJECT_KEY = new SahaElementType("OBJECT_KEY");
  IElementType PAIR = new SahaElementType("PAIR");
  IElementType PARENTHESIS = new SahaElementType("PARENTHESIS");
  IElementType PREFIX = new SahaElementType("PREFIX");
  IElementType RULE_ARGUMENT = new SahaElementType("RULE_ARGUMENT");
  IElementType RULE_BODY = new SahaElementType("RULE_BODY");
  IElementType RULE_STATEMENT = new SahaElementType("RULE_STATEMENT");
  IElementType RULE_TYPE = new SahaElementType("RULE_TYPE");
  IElementType STRING_LITERAL = new SahaElementType("STRING_LITERAL");
  IElementType SUFFIX = new SahaElementType("SUFFIX");
  IElementType SYMBOL_PATH = new SahaElementType("SYMBOL_PATH");
  IElementType TABLE = new SahaElementType("TABLE");
  IElementType TERM = new SahaElementType("TERM");
  IElementType TYPE_HINT = new SahaElementType("TYPE_HINT");
  IElementType VALUE = new SahaElementType("VALUE");

  IElementType ACCENT = new SahaElementType("^");
  IElementType ANGLE_L = new SahaElementType("<");
  IElementType ANGLE_R = new SahaElementType(">");
  IElementType ARROW = new SahaElementType("ARROW");
  IElementType AS = new SahaElementType("as");
  IElementType AT = new SahaElementType("@");
  IElementType BOOLEAN = new SahaElementType("BOOLEAN");
  IElementType BRACE_L = new SahaElementType("{");
  IElementType BRACE_R = new SahaElementType("}");
  IElementType BRACKET_L = new SahaElementType("[");
  IElementType BRACKET_R = new SahaElementType("]");
  IElementType BYTE = new SahaElementType("BYTE");
  IElementType CHARACTER = new SahaElementType("CHARACTER");
  IElementType CHOOSE = new SahaElementType("|");
  IElementType COLON = new SahaElementType(":");
  IElementType COMMA = new SahaElementType(",");
  IElementType COMMENT_BLOCK = new SahaElementType("COMMENT_BLOCK");
  IElementType COMMENT_DOC = new SahaElementType("COMMENT_DOC");
  IElementType COMMENT_LINE = new SahaElementType("COMMENT_LINE");
  IElementType DECIMAL = new SahaElementType("DECIMAL");
  IElementType DOLLAR = new SahaElementType("$");
  IElementType DOT = new SahaElementType(".");
  IElementType DOUBLE_COLON = new SahaElementType("DOUBLE_COLON");
  IElementType EQ = new SahaElementType("=");
  IElementType ESCAPE = new SahaElementType("\\");
  IElementType ESCAPE_SPECIAL = new SahaElementType("ESCAPE_SPECIAL");
  IElementType ESCAPE_UNICODE = new SahaElementType("ESCAPE_UNICODE");
  IElementType HASH = new SahaElementType("HASH");
  IElementType HYPHEN = new SahaElementType("-");
  IElementType INTEGER = new SahaElementType("INTEGER");
  IElementType MANY = new SahaElementType("*");
  IElementType MANY1 = new SahaElementType("+");
  IElementType NOT = new SahaElementType("!");
  IElementType NULL = new SahaElementType("NULL");
  IElementType OPTIONAL = new SahaElementType("?");
  IElementType PARENTHESIS_L = new SahaElementType("(");
  IElementType PARENTHESIS_R = new SahaElementType(")");
  IElementType QUOTATION = new SahaElementType("\"");
  IElementType REGEX_RANGE = new SahaElementType("REGEX_RANGE");
  IElementType SEMICOLON = new SahaElementType(";");
  IElementType SIGN = new SahaElementType("SIGN");
  IElementType SLOT_L = new SahaElementType("{%");
  IElementType SLOT_R = new SahaElementType("%}");
  IElementType SOFT_CONNECT = new SahaElementType("~");
  IElementType STRING_DQ = new SahaElementType("STRING_DQ");
  IElementType STRING_SQ = new SahaElementType("STRING_SQ");
  IElementType SYMBOL = new SahaElementType("SYMBOL");
  IElementType TAGGED = new SahaElementType("<-");
  IElementType TO = new SahaElementType("->");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new SahaAtomNode(node);
      }
      else if (type == BRANCH_MARK) {
        return new SahaBranchMarkNode(node);
      }
      else if (type == CHARSET) {
        return new SahaCharsetNode(node);
      }
      else if (type == DEFINE) {
        return new SahaDefineNode(node);
      }
      else if (type == EXPORT_STATEMENT) {
        return new SahaExportStatementNode(node);
      }
      else if (type == EXPR) {
        return new SahaExprNode(node);
      }
      else if (type == FIELD_MARK) {
        return new SahaFieldMarkNode(node);
      }
      else if (type == FIELD_RHS) {
        return new SahaFieldRhsNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new SahaFunctionCallNode(node);
      }
      else if (type == GRAMMAR_STATEMENT) {
        return new SahaGrammarStatementNode(node);
      }
      else if (type == IDENTIFIER) {
        return new SahaIdentifierNode(node);
      }
      else if (type == IMPORT_BODY) {
        return new SahaImportBodyNode(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new SahaImportStatementNode(node);
      }
      else if (type == INFIX) {
        return new SahaInfixNode(node);
      }
      else if (type == KEY) {
        return new SahaKeyNode(node);
      }
      else if (type == KEY_SYMBOL) {
        return new SahaKeySymbolNode(node);
      }
      else if (type == KW_IMPORT) {
        return new SahaKwImportNode(node);
      }
      else if (type == MACRO_ARG) {
        return new SahaMacroArgNode(node);
      }
      else if (type == MACRO_CALL) {
        return new SahaMacroCallNode(node);
      }
      else if (type == MACRO_STATEMENT) {
        return new SahaMacroStatementNode(node);
      }
      else if (type == MODIFIERS) {
        return new SahaModifiersNode(node);
      }
      else if (type == NAMESPACE) {
        return new SahaNamespaceNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new SahaNumberSuffixNode(node);
      }
      else if (type == OBJECT) {
        return new SahaObjectNode(node);
      }
      else if (type == OBJECT_ITEM) {
        return new SahaObjectItemNode(node);
      }
      else if (type == OBJECT_KEY) {
        return new SahaObjectKeyNode(node);
      }
      else if (type == PAIR) {
        return new SahaPairNode(node);
      }
      else if (type == PARENTHESIS) {
        return new SahaParenthesisNode(node);
      }
      else if (type == PREFIX) {
        return new SahaPrefixNode(node);
      }
      else if (type == RULE_ARGUMENT) {
        return new SahaRuleArgumentNode(node);
      }
      else if (type == RULE_BODY) {
        return new SahaRuleBodyNode(node);
      }
      else if (type == RULE_STATEMENT) {
        return new SahaRuleStatementNode(node);
      }
      else if (type == RULE_TYPE) {
        return new SahaRuleTypeNode(node);
      }
      else if (type == STRING_LITERAL) {
        return new SahaStringLiteralNode(node);
      }
      else if (type == SUFFIX) {
        return new SahaSuffixNode(node);
      }
      else if (type == SYMBOL_PATH) {
        return new SahaSymbolPathNode(node);
      }
      else if (type == TABLE) {
        return new SahaTableNode(node);
      }
      else if (type == TERM) {
        return new SahaTermNode(node);
      }
      else if (type == TYPE_HINT) {
        return new SahaTypeHintNode(node);
      }
      else if (type == VALUE) {
        return new SahaValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
