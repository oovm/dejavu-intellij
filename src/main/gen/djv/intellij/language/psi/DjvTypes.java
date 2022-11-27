// This is a generated file. Not intended for manual editing.
package djv.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import djv.intellij.language.psi_node.*;

public interface DjvTypes {

  IElementType ATOM = new DjvElementType("ATOM");
  IElementType EXPR = new DjvElementType("EXPR");
  IElementType FUNCTION_CALL = new DjvElementType("FUNCTION_CALL");
  IElementType IDENTIFIER = new DjvElementType("IDENTIFIER");
  IElementType INFIX = new DjvElementType("INFIX");
  IElementType INLINE_ELSE = new DjvElementType("INLINE_ELSE");
  IElementType INLINE_FOR_STATEMENT = new DjvElementType("INLINE_FOR_STATEMENT");
  IElementType INLINE_IF_STATEMENT = new DjvElementType("INLINE_IF_STATEMENT");
  IElementType INLINE_LET_STATEMENT = new DjvElementType("INLINE_LET_STATEMENT");
  IElementType KEY = new DjvElementType("KEY");
  IElementType KEY_SYMBOL = new DjvElementType("KEY_SYMBOL");
  IElementType KW_IN = new DjvElementType("KW_IN");
  IElementType MACRO_CALL = new DjvElementType("MACRO_CALL");
  IElementType MODIFIERS = new DjvElementType("MODIFIERS");
  IElementType NAMESPACE = new DjvElementType("NAMESPACE");
  IElementType NUMBER_SUFFIX = new DjvElementType("NUMBER_SUFFIX");
  IElementType OBJECT = new DjvElementType("OBJECT");
  IElementType OBJECT_ITEM = new DjvElementType("OBJECT_ITEM");
  IElementType OBJECT_KEY = new DjvElementType("OBJECT_KEY");
  IElementType PAIR = new DjvElementType("PAIR");
  IElementType PARENTHESIS = new DjvElementType("PARENTHESIS");
  IElementType PATTERN = new DjvElementType("PATTERN");
  IElementType PREFIX = new DjvElementType("PREFIX");
  IElementType SLOT_ELSE = new DjvElementType("SLOT_ELSE");
  IElementType SLOT_ELSE_IF = new DjvElementType("SLOT_ELSE_IF");
  IElementType SLOT_ELSE_IF_START = new DjvElementType("SLOT_ELSE_IF_START");
  IElementType SLOT_EXPRESSION = new DjvElementType("SLOT_EXPRESSION");
  IElementType SLOT_FOR_ELSE = new DjvElementType("SLOT_FOR_ELSE");
  IElementType SLOT_FOR_END = new DjvElementType("SLOT_FOR_END");
  IElementType SLOT_FOR_START = new DjvElementType("SLOT_FOR_START");
  IElementType SLOT_FOR_STATEMENT = new DjvElementType("SLOT_FOR_STATEMENT");
  IElementType SLOT_IF_ELSE = new DjvElementType("SLOT_IF_ELSE");
  IElementType SLOT_IF_END = new DjvElementType("SLOT_IF_END");
  IElementType SLOT_IF_START = new DjvElementType("SLOT_IF_START");
  IElementType SLOT_IF_STATEMENT = new DjvElementType("SLOT_IF_STATEMENT");
  IElementType SLOT_L = new DjvElementType("SLOT_L");
  IElementType SLOT_R = new DjvElementType("SLOT_R");
  IElementType STRING_LITERAL = new DjvElementType("STRING_LITERAL");
  IElementType SUFFIX = new DjvElementType("SUFFIX");
  IElementType SYMBOL_PATH = new DjvElementType("SYMBOL_PATH");
  IElementType TABLE = new DjvElementType("TABLE");
  IElementType TERM = new DjvElementType("TERM");
  IElementType TEXT_STATEMENT = new DjvElementType("TEXT_STATEMENT");
  IElementType TYPE_HINT = new DjvElementType("TYPE_HINT");
  IElementType VALUE = new DjvElementType("VALUE");

  IElementType ACCENT = new DjvElementType("^");
  IElementType ADD = new DjvElementType("ADD");
  IElementType ANGLE_L = new DjvElementType("<");
  IElementType ANGLE_R = new DjvElementType(">");
  IElementType ARROW = new DjvElementType("ARROW");
  IElementType AS = new DjvElementType("as");
  IElementType AT = new DjvElementType("@");
  IElementType BOOLEAN = new DjvElementType("BOOLEAN");
  IElementType BRACE_L = new DjvElementType("{");
  IElementType BRACE_R = new DjvElementType("}");
  IElementType BRACKET_L = new DjvElementType("[");
  IElementType BRACKET_R = new DjvElementType("]");
  IElementType BYTE = new DjvElementType("BYTE");
  IElementType CHARACTER = new DjvElementType("CHARACTER");
  IElementType CHOOSE = new DjvElementType("|");
  IElementType COLON = new DjvElementType(":");
  IElementType COMMA = new DjvElementType(",");
  IElementType COMMENT_BLOCK = new DjvElementType("COMMENT_BLOCK");
  IElementType COMMENT_DOC = new DjvElementType("COMMENT_DOC");
  IElementType COMMENT_LINE = new DjvElementType("COMMENT_LINE");
  IElementType DECIMAL = new DjvElementType("DECIMAL");
  IElementType DIV = new DjvElementType("DIV");
  IElementType DOLLAR = new DjvElementType("$");
  IElementType DOT = new DjvElementType(".");
  IElementType DOUBLE_COLON = new DjvElementType("DOUBLE_COLON");
  IElementType EQ = new DjvElementType("=");
  IElementType ESCAPE = new DjvElementType("\\");
  IElementType ESCAPE_SPECIAL = new DjvElementType("ESCAPE_SPECIAL");
  IElementType ESCAPE_UNICODE = new DjvElementType("ESCAPE_UNICODE");
  IElementType HASH = new DjvElementType("HASH");
  IElementType HYPHEN = new DjvElementType("-");
  IElementType INTEGER = new DjvElementType("INTEGER");
  IElementType KW_ELSE = new DjvElementType("else");
  IElementType KW_ELSE_IF = new DjvElementType("else-if");
  IElementType KW_END = new DjvElementType("KW_END");
  IElementType KW_END_FOR = new DjvElementType("end-for");
  IElementType KW_END_IF = new DjvElementType("end-if");
  IElementType KW_FOR = new DjvElementType("for");
  IElementType KW_IF = new DjvElementType("if");
  IElementType KW_LET = new DjvElementType("KW_LET");
  IElementType MANY = new DjvElementType("*");
  IElementType MANY1 = new DjvElementType("+");
  IElementType MOD = new DjvElementType("MOD");
  IElementType MUL = new DjvElementType("MUL");
  IElementType NE = new DjvElementType("NE");
  IElementType NOT = new DjvElementType("!");
  IElementType NULL = new DjvElementType("NULL");
  IElementType OPTIONAL = new DjvElementType("?");
  IElementType PARENTHESIS_L = new DjvElementType("(");
  IElementType PARENTHESIS_R = new DjvElementType(")");
  IElementType QUOTATION = new DjvElementType("\"");
  IElementType SAHA_TEXT = new DjvElementType("<TEXT>");
  IElementType SEMICOLON = new DjvElementType(";");
  IElementType SIGN = new DjvElementType("SIGN");
  IElementType SLOT_END = new DjvElementType("%}");
  IElementType SLOT_START = new DjvElementType("{%");
  IElementType SOFT_CONNECT = new DjvElementType("~");
  IElementType STRING_DQ = new DjvElementType("STRING_DQ");
  IElementType STRING_SQ = new DjvElementType("STRING_SQ");
  IElementType SUB = new DjvElementType("SUB");
  IElementType SYMBOL = new DjvElementType("SYMBOL");
  IElementType TAGGED = new DjvElementType("<-");
  IElementType TO = new DjvElementType("->");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new DjvAtomNode(node);
      }
      else if (type == EXPR) {
        return new DjvExprNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new DjvFunctionCallNode(node);
      }
      else if (type == IDENTIFIER) {
        return new DjvIdentifierNode(node);
      }
      else if (type == INFIX) {
        return new DjvInfixNode(node);
      }
      else if (type == INLINE_ELSE) {
        return new DjvInlineElseNode(node);
      }
      else if (type == INLINE_FOR_STATEMENT) {
        return new DjvInlineForStatementNode(node);
      }
      else if (type == INLINE_IF_STATEMENT) {
        return new DjvInlineIfStatementNode(node);
      }
      else if (type == INLINE_LET_STATEMENT) {
        return new DjvInlineLetStatementNode(node);
      }
      else if (type == KEY) {
        return new DjvKeyNode(node);
      }
      else if (type == KEY_SYMBOL) {
        return new DjvKeySymbolNode(node);
      }
      else if (type == KW_IN) {
        return new DjvKwInNode(node);
      }
      else if (type == MACRO_CALL) {
        return new DjvMacroCallNode(node);
      }
      else if (type == MODIFIERS) {
        return new DjvModifiersNode(node);
      }
      else if (type == NAMESPACE) {
        return new DjvNamespaceNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new DjvNumberSuffixNode(node);
      }
      else if (type == OBJECT) {
        return new DjvObjectNode(node);
      }
      else if (type == OBJECT_ITEM) {
        return new DjvObjectItemNode(node);
      }
      else if (type == OBJECT_KEY) {
        return new DjvObjectKeyNode(node);
      }
      else if (type == PAIR) {
        return new DjvPairNode(node);
      }
      else if (type == PARENTHESIS) {
        return new DjvParenthesisNode(node);
      }
      else if (type == PATTERN) {
        return new DjvPatternNode(node);
      }
      else if (type == PREFIX) {
        return new DjvPrefixNode(node);
      }
      else if (type == SLOT_ELSE) {
        return new DjvSlotElseNode(node);
      }
      else if (type == SLOT_ELSE_IF) {
        return new DjvSlotElseIfNode(node);
      }
      else if (type == SLOT_ELSE_IF_START) {
        return new DjvSlotElseIfStartNode(node);
      }
      else if (type == SLOT_EXPRESSION) {
        return new DjvSlotExpressionNode(node);
      }
      else if (type == SLOT_FOR_ELSE) {
        return new DjvSlotForElseNode(node);
      }
      else if (type == SLOT_FOR_END) {
        return new DjvSlotForEndNode(node);
      }
      else if (type == SLOT_FOR_START) {
        return new DjvSlotForStartNode(node);
      }
      else if (type == SLOT_FOR_STATEMENT) {
        return new DjvSlotForStatementNode(node);
      }
      else if (type == SLOT_IF_ELSE) {
        return new DjvSlotIfElseNode(node);
      }
      else if (type == SLOT_IF_END) {
        return new DjvSlotIfEndNode(node);
      }
      else if (type == SLOT_IF_START) {
        return new DjvSlotIfStartNode(node);
      }
      else if (type == SLOT_IF_STATEMENT) {
        return new DjvSlotIfStatementNode(node);
      }
      else if (type == SLOT_L) {
        return new DjvSlotLNode(node);
      }
      else if (type == SLOT_R) {
        return new DjvSlotRNode(node);
      }
      else if (type == STRING_LITERAL) {
        return new DjvStringLiteralNode(node);
      }
      else if (type == SUFFIX) {
        return new DjvSuffixNode(node);
      }
      else if (type == SYMBOL_PATH) {
        return new DjvSymbolPathNode(node);
      }
      else if (type == TABLE) {
        return new DjvTableNode(node);
      }
      else if (type == TERM) {
        return new DjvTermNode(node);
      }
      else if (type == TEXT_STATEMENT) {
        return new DjvTextStatementNode(node);
      }
      else if (type == TYPE_HINT) {
        return new DjvTypeHintNode(node);
      }
      else if (type == VALUE) {
        return new DjvValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
