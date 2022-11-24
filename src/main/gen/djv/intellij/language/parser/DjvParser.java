// This is a generated file. Not intended for manual editing.
package djv.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static djv.intellij.language.psi.DjvTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DjvParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return DejaVu(b, l + 1);
  }

  /* ********************************************************** */
  // statements*
  static boolean DejaVu(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DejaVu")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DejaVu", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '(' [CHOOSE] expr ')' | field_mark | branch_mark | function_call | value
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = atom_0(b, l + 1);
    if (!r) r = field_mark(b, l + 1);
    if (!r) r = branch_mark(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' [CHOOSE] expr ')'
  private static boolean atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && atom_0_1(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // [CHOOSE]
  private static boolean atom_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0_1")) return false;
    consumeToken(b, CHOOSE);
    return true;
  }

  /* ********************************************************** */
  // HASH identifier
  public static boolean branch_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branch_mark")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, BRANCH_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER | esc
  static boolean char_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_$")) return false;
    boolean r;
    r = consumeToken(b, CHARACTER);
    if (!r) r = esc(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // REGEX_RANGE
  public static boolean charset(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charset")) return false;
    if (!nextTokenIs(b, REGEX_RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGEX_RANGE);
    exit_section_(b, m, CHARSET, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT_LINE | COMMENT_BLOCK | COMMENT_DOC
  static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    boolean r;
    r = consumeToken(b, COMMENT_LINE);
    if (!r) r = consumeToken(b, COMMENT_BLOCK);
    if (!r) r = consumeToken(b, COMMENT_DOC);
    return r;
  }

  /* ********************************************************** */
  // "def" | "class" | "struct" | "rule" | "enum" | "union" | "function" | "fun"
  public static boolean define(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINE, "<define>");
    r = consumeToken(b, "def");
    if (!r) r = consumeToken(b, "class");
    if (!r) r = consumeToken(b, "struct");
    if (!r) r = consumeToken(b, "rule");
    if (!r) r = consumeToken(b, "enum");
    if (!r) r = consumeToken(b, "union");
    if (!r) r = consumeToken(b, "function");
    if (!r) r = consumeToken(b, "fun");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EQ | COLON
  static boolean eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq")) return false;
    if (!nextTokenIs(b, "", COLON, EQ)) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
    return r;
  }

  /* ********************************************************** */
  // ESCAPE_UNICODE | ESCAPE_SPECIAL
  static boolean esc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "esc")) return false;
    if (!nextTokenIs(b, "", ESCAPE_SPECIAL, ESCAPE_UNICODE)) return false;
    boolean r;
    r = consumeToken(b, ESCAPE_UNICODE);
    if (!r) r = consumeToken(b, ESCAPE_SPECIAL);
    return r;
  }

  /* ********************************************************** */
  // "codegen" identifier object
  public static boolean export_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_STATEMENT, "<export statement>");
    r = consumeToken(b, "codegen");
    r = r && identifier(b, l + 1);
    p = r; // pin = identifier
    r = r && object(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // term (infix term | term)*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = term(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (infix term | term)*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  // infix term | term
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_1_0_0(b, l + 1);
    if (!r) r = term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infix term
  private static boolean expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON field_rhs
  public static boolean field_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_mark")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && field_rhs(b, l + 1);
    exit_section_(b, m, FIELD_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | charset | string_literal
  public static boolean field_rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_RHS, "<field rhs>");
    r = identifier(b, l + 1);
    if (!r) r = charset(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AT identifier <<parenthesis expr COMMA>>
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && identifier(b, l + 1);
    r = r && parenthesis(b, l + 1, DjvParser::expr, COMMA_parser_);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L [identifier (COMMA identifier)* [COMMA]] BRACE_R
  public static boolean import_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && import_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, IMPORT_BODY, r);
    return r;
  }

  // [identifier (COMMA identifier)* [COMMA]]
  private static boolean import_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1")) return false;
    import_body_1_0(b, l + 1);
    return true;
  }

  // identifier (COMMA identifier)* [COMMA]
  private static boolean import_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && import_body_1_0_1(b, l + 1);
    r = r && import_body_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean import_body_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_body_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_body_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean import_body_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean import_body_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_body_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // kw_import string_literal [import_body]
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, "<import statement>");
    r = kw_import(b, l + 1);
    r = r && string_literal(b, l + 1);
    p = r; // pin = string_literal
    r = r && import_statement_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [import_body]
  private static boolean import_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_2")) return false;
    import_body(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CHOOSE | SOFT_CONNECT
  public static boolean infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix")) return false;
    if (!nextTokenIs(b, "<infix>", CHOOSE, SOFT_CONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX, "<infix>");
    r = consumeToken(b, CHOOSE);
    if (!r) r = consumeToken(b, SOFT_CONNECT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string_literal | key_symbol | INTEGER
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = string_literal(b, l + 1);
    if (!r) r = key_symbol(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean key_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, KEY_SYMBOL, r);
    return r;
  }

  /* ********************************************************** */
  // "for"
  public static boolean kw_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kw_else")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KW_ELSE, "<kw else>");
    r = consumeToken(b, "for");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "end-for" | "end"
  public static boolean kw_end_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kw_end_for")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KW_END_FOR, "<kw end for>");
    r = consumeToken(b, "end-for");
    if (!r) r = consumeToken(b, "end");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "for"
  public static boolean kw_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kw_for")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KW_FOR, "<kw for>");
    r = consumeToken(b, "for");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "import" | "use" | "using"
  public static boolean kw_import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kw_import")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KW_IMPORT, "<kw import>");
    r = consumeToken(b, "import");
    if (!r) r = consumeToken(b, "use");
    if (!r) r = consumeToken(b, "using");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "in"
  public static boolean kw_in(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kw_in")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KW_IN, "<kw in>");
    r = consumeToken(b, "in");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // value | macro_statement
  public static boolean macro_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_ARG, "<macro arg>");
    r = value(b, l + 1);
    if (!r) r = macro_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HASH identifier
  public static boolean macro_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_call")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, MACRO_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // AT SYMBOL <<parenthesis macro_arg COMMA>>
  public static boolean macro_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_statement")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, SYMBOL);
    r = r && parenthesis(b, l + 1, DjvParser::macro_arg, COMMA_parser_);
    exit_section_(b, m, MACRO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (identifier !('('|'{'|ARROW|':'))*
  public static boolean modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, MODIFIERS, "<modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!modifiers_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // identifier !('('|'{'|ARROW|':')
  private static boolean modifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && modifiers_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !('('|'{'|ARROW|':')
  private static boolean modifiers_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !modifiers_0_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '('|'{'|ARROW|':'
  private static boolean modifiers_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, PARENTHESIS_L);
    if (!r) r = consumeToken(b, BRACE_L);
    if (!r) r = consumeToken(b, ARROW);
    if (!r) r = consumeToken(b, COLON);
    return r;
  }

  /* ********************************************************** */
  // identifier (DOUBLE_COLON identifier)*
  public static boolean namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && namespace_1(b, l + 1);
    exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  // (DOUBLE_COLON identifier)*
  private static boolean namespace_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespace_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_1", c)) break;
    }
    return true;
  }

  // DOUBLE_COLON identifier
  private static boolean namespace_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) [number_suffix] | [SIGN] BYTE
  static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL) [number_suffix]
  private static boolean num_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    r = r && num_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // INTEGER | DECIMAL
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    return r;
  }

  // [number_suffix]
  private static boolean num_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_2")) return false;
    number_suffix(b, l + 1);
    return true;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && consumeToken(b, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean number_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_suffix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, NUMBER_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L (object_item [COMMA|SEMICOLON])* BRACE_R
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && object_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  // (object_item [COMMA|SEMICOLON])*
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_1", c)) break;
    }
    return true;
  }

  // object_item [COMMA|SEMICOLON]
  private static boolean object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_item(b, l + 1);
    r = r && object_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA|SEMICOLON]
  private static boolean object_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_1")) return false;
    object_1_0_1_0(b, l + 1);
    return true;
  }

  // COMMA|SEMICOLON
  private static boolean object_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // object_key COLON value
  public static boolean object_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_ITEM, "<object item>");
    r = object_key(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | string_literal
  public static boolean object_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_KEY, "<object key>");
    r = identifier(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol_path eq value
  public static boolean pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
    r = symbol_path(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  //   | BRACKET_L <<param>> BRACKET_R
  //   | BRACE_L <<param>> BRACE_R
  static boolean paired(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paired_0(b, l + 1, _param);
    if (!r) r = paired_1(b, l + 1, _param);
    if (!r) r = paired_2(b, l + 1, _param);
    exit_section_(b, m, null, r);
    return r;
  }

  // PARENTHESIS_L <<param>> PARENTHESIS_R
  private static boolean paired_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACKET_L <<param>> BRACKET_R
  private static boolean paired_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACE_L <<param>> BRACE_R
  private static boolean paired_2(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L [<<item>> (<<delimiter>> <<item>>)* [<<delimiter>>]] PARENTHESIS_R
  public static boolean parenthesis(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && parenthesis_1(b, l + 1, _item, _delimiter);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, PARENTHESIS, r);
    return r;
  }

  // [<<item>> (<<delimiter>> <<item>>)* [<<delimiter>>]]
  private static boolean parenthesis_1(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1")) return false;
    parenthesis_1_0(b, l + 1, _item, _delimiter);
    return true;
  }

  // <<item>> (<<delimiter>> <<item>>)* [<<delimiter>>]
  private static boolean parenthesis_1_0(PsiBuilder b, int l, Parser _item, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _item.parse(b, l);
    r = r && parenthesis_1_0_1(b, l + 1, _delimiter, _item);
    r = r && parenthesis_1_0_2(b, l + 1, _delimiter);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<delimiter>> <<item>>)*
  private static boolean parenthesis_1_0_1(PsiBuilder b, int l, Parser _delimiter, Parser _item) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parenthesis_1_0_1_0(b, l + 1, _delimiter, _item)) break;
      if (!empty_element_parsed_guard_(b, "parenthesis_1_0_1", c)) break;
    }
    return true;
  }

  // <<delimiter>> <<item>>
  private static boolean parenthesis_1_0_1_0(PsiBuilder b, int l, Parser _delimiter, Parser _item) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _delimiter.parse(b, l);
    r = r && _item.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<delimiter>>]
  private static boolean parenthesis_1_0_2(PsiBuilder b, int l, Parser _delimiter) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_2")) return false;
    _delimiter.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // ACCENT
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    if (!nextTokenIs(b, ACCENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCENT);
    exit_section_(b, m, PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L PARENTHESIS_R
  public static boolean rule_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_argument")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARENTHESIS_L, PARENTHESIS_R);
    exit_section_(b, m, RULE_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L [CHOOSE] [expr] BRACE_R
  public static boolean rule_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && rule_body_1(b, l + 1);
    r = r && rule_body_2(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, RULE_BODY, r);
    return r;
  }

  // [CHOOSE]
  private static boolean rule_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_body_1")) return false;
    consumeToken(b, CHOOSE);
    return true;
  }

  // [expr]
  private static boolean rule_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_body_2")) return false;
    expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // define modifiers identifier [rule_argument] [rule_type] rule_body
  public static boolean rule_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RULE_STATEMENT, "<rule statement>");
    r = define(b, l + 1);
    r = r && modifiers(b, l + 1);
    r = r && identifier(b, l + 1);
    p = r; // pin = identifier
    r = r && report_error_(b, rule_statement_3(b, l + 1));
    r = p && report_error_(b, rule_statement_4(b, l + 1)) && r;
    r = p && rule_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [rule_argument]
  private static boolean rule_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement_3")) return false;
    rule_argument(b, l + 1);
    return true;
  }

  // [rule_type]
  private static boolean rule_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement_4")) return false;
    rule_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (COLON | ARROW) identifier
  public static boolean rule_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_type")) return false;
    if (!nextTokenIs(b, "<rule type>", ARROW, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_TYPE, "<rule type>");
    r = rule_type_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COLON | ARROW
  private static boolean rule_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_type_0")) return false;
    boolean r;
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, ARROW);
    return r;
  }

  /* ********************************************************** */
  // slot_start kw_else slot_end
  public static boolean slot_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_else")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_start(b, l + 1);
    r = r && kw_else(b, l + 1);
    r = r && slot_end(b, l + 1);
    exit_section_(b, m, SLOT_ELSE, r);
    return r;
  }

  /* ********************************************************** */
  // SLOT_R
  public static boolean slot_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_end")) return false;
    if (!nextTokenIs(b, SLOT_R)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLOT_R);
    exit_section_(b, m, SLOT_END, r);
    return r;
  }

  /* ********************************************************** */
  // slot_start identifier? slot_end
  public static boolean slot_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_EXPRESSION, null);
    r = slot_start(b, l + 1);
    p = r; // pin = slot_start
    r = r && report_error_(b, slot_expression_1(b, l + 1));
    r = p && slot_end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // identifier?
  private static boolean slot_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression_1")) return false;
    identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // slot_for_start statements* slot_for_else? slot_for_end
  public static boolean slot_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_FOR, null);
    r = slot_for_start(b, l + 1);
    p = r; // pin = slot_for_start
    r = r && report_error_(b, slot_for_1(b, l + 1));
    r = p && report_error_(b, slot_for_2(b, l + 1)) && r;
    r = p && slot_for_end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statements*
  private static boolean slot_for_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_for_1", c)) break;
    }
    return true;
  }

  // slot_for_else?
  private static boolean slot_for_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_2")) return false;
    slot_for_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // slot_else statements*
  public static boolean slot_for_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_else")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_else(b, l + 1);
    r = r && slot_for_else_1(b, l + 1);
    exit_section_(b, m, SLOT_FOR_ELSE, r);
    return r;
  }

  // statements*
  private static boolean slot_for_else_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_else_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_for_else_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // slot_start kw_end_for slot_end
  public static boolean slot_for_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_end")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_start(b, l + 1);
    r = r && kw_end_for(b, l + 1);
    r = r && slot_end(b, l + 1);
    exit_section_(b, m, SLOT_FOR_END, r);
    return r;
  }

  /* ********************************************************** */
  // slot_start kw_for kw_in slot_end
  public static boolean slot_for_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_start")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_start(b, l + 1);
    r = r && kw_for(b, l + 1);
    r = r && kw_in(b, l + 1);
    r = r && slot_end(b, l + 1);
    exit_section_(b, m, SLOT_FOR_START, r);
    return r;
  }

  /* ********************************************************** */
  // SLOT_L
  public static boolean slot_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_start")) return false;
    if (!nextTokenIs(b, SLOT_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLOT_L);
    exit_section_(b, m, SLOT_START, r);
    return r;
  }

  /* ********************************************************** */
  // slot_for
  //     | slot_expression
  //     | text_statement
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    if (!nextTokenIs(b, "", SAHA_TEXT, SLOT_L)) return false;
    boolean r;
    r = slot_for(b, l + 1);
    if (!r) r = slot_expression(b, l + 1);
    if (!r) r = text_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // esc | STRING_SQ char* STRING_SQ | STRING_DQ char* STRING_DQ
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = esc(b, l + 1);
    if (!r) r = string_literal_1(b, l + 1);
    if (!r) r = string_literal_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // STRING_SQ char* STRING_SQ
  private static boolean string_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_SQ);
    r = r && string_literal_1_1(b, l + 1);
    r = r && consumeToken(b, STRING_SQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // char*
  private static boolean string_literal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_literal_1_1", c)) break;
    }
    return true;
  }

  // STRING_DQ char* STRING_DQ
  private static boolean string_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_DQ);
    r = r && string_literal_2_1(b, l + 1);
    r = r && consumeToken(b, STRING_DQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // char*
  private static boolean string_literal_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_literal_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPTIONAL | MANY | MANY1
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = consumeToken(b, OPTIONAL);
    if (!r) r = consumeToken(b, MANY);
    if (!r) r = consumeToken(b, MANY1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // key (DOT key)*
  public static boolean symbol_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_PATH, "<symbol path>");
    r = key(b, l + 1);
    r = r && symbol_path_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT key)*
  private static boolean symbol_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_path_1", c)) break;
    }
    return true;
  }

  // DOT key
  private static boolean symbol_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && key(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [type_hint] <<paired table_inner>>
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    r = table_0(b, l + 1);
    r = r && paired(b, l + 1, DjvParser::table_inner);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_hint]
  private static boolean table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0")) return false;
    type_hint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [table_item (COMMA table_item)* [COMMA]]
  static boolean table_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner")) return false;
    table_inner_0(b, l + 1);
    return true;
  }

  // table_item (COMMA table_item)* [COMMA]
  private static boolean table_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_item(b, l + 1);
    r = r && table_inner_0_1(b, l + 1);
    r = r && table_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA table_item)*
  private static boolean table_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!table_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA table_item
  private static boolean table_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && table_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean table_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // pair | value
  static boolean table_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_item")) return false;
    boolean r;
    r = pair(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (prefix)* atom (suffix)*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = term_0(b, l + 1);
    r = r && atom(b, l + 1);
    r = r && term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (prefix)*
  private static boolean term_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_0", c)) break;
    }
    return true;
  }

  // (prefix)
  private static boolean term_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (suffix)*
  private static boolean term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_2", c)) break;
    }
    return true;
  }

  // (suffix)
  private static boolean term_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SAHA_TEXT
  public static boolean text_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text_statement")) return false;
    if (!nextTokenIs(b, SAHA_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SAHA_TEXT);
    exit_section_(b, m, TEXT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, TYPE_HINT, r);
    return r;
  }

  /* ********************************************************** */
  // NULL | BOOLEAN | num | string_literal | table | namespace | charset
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = num(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = namespace(b, l + 1);
    if (!r) r = charset(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
}
