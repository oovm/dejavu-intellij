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
  // '(' expr ')' | function_call | value
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = atom_0(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' expr ')'
  private static boolean atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
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
  // term (infix term)*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = term(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (infix term)*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  // infix term
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier <<parenthesis expr COMMA>>
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
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
  // ADD | SUB | MUL | DIV | MOD | EQ | NE
  public static boolean infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX, "<infix>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_ELSE '{' '}' {
  // }
  public static boolean inline_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_else")) return false;
    if (!nextTokenIs(b, KW_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ELSE, BRACE_L, BRACE_R);
    r = r && inline_else_3(b, l + 1);
    exit_section_(b, m, INLINE_ELSE, r);
    return r;
  }

  // {
  // }
  private static boolean inline_else_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_FOR pattern kw_in expr '{' '}' [inline_else] {
  // }
  public static boolean inline_for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_for_statement")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOR);
    r = r && pattern(b, l + 1);
    r = r && kw_in(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, BRACE_L, BRACE_R);
    r = r && inline_for_statement_6(b, l + 1);
    r = r && inline_for_statement_7(b, l + 1);
    exit_section_(b, m, INLINE_FOR_STATEMENT, r);
    return r;
  }

  // [inline_else]
  private static boolean inline_for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_for_statement_6")) return false;
    inline_else(b, l + 1);
    return true;
  }

  // {
  // }
  private static boolean inline_for_statement_7(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_IF expr '{' '}' [inline_else] {
  // }
  public static boolean inline_if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_if_statement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, BRACE_L, BRACE_R);
    r = r && inline_if_statement_4(b, l + 1);
    r = r && inline_if_statement_5(b, l + 1);
    exit_section_(b, m, INLINE_IF_STATEMENT, r);
    return r;
  }

  // [inline_else]
  private static boolean inline_if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_if_statement_4")) return false;
    inline_else(b, l + 1);
    return true;
  }

  // {
  // }
  private static boolean inline_if_statement_5(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_LET pattern '=' expr {
  // }
  public static boolean inline_let_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_let_statement")) return false;
    if (!nextTokenIs(b, KW_LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LET);
    r = r && pattern(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && expr(b, l + 1);
    r = r && inline_let_statement_4(b, l + 1);
    exit_section_(b, m, INLINE_LET_STATEMENT, r);
    return r;
  }

  // {
  // }
  private static boolean inline_let_statement_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // inline_let_statement
  static boolean inline_normal(PsiBuilder b, int l) {
    return inline_let_statement(b, l + 1);
  }

  /* ********************************************************** */
  // inline_for_statement |
  //     inline_if_statement |
  //     identifier
  static boolean inlined_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inlined_end")) return false;
    boolean r;
    r = inline_for_statement(b, l + 1);
    if (!r) r = inline_if_statement(b, l + 1);
    if (!r) r = identifier(b, l + 1);
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
  // identifier (COMMA identifier)*
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && pattern_1(b, l + 1);
    exit_section_(b, m, PATTERN, r);
    return r;
  }

  // (COMMA identifier)*
  private static boolean pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pattern_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pattern_1", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ADD
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    if (!nextTokenIs(b, ADD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    exit_section_(b, m, PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // slot_l KW_ELSE slot_r
  public static boolean slot_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_else")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && consumeToken(b, KW_ELSE);
    r = r && slot_r(b, l + 1);
    exit_section_(b, m, SLOT_ELSE, r);
    return r;
  }

  /* ********************************************************** */
  // slot_else_if_start statements*
  public static boolean slot_else_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_else_if")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_ELSE_IF, null);
    r = slot_else_if_start(b, l + 1);
    p = r; // pin = slot_else_if_start
    r = r && slot_else_if_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statements*
  private static boolean slot_else_if_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_else_if_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_else_if_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // slot_l KW_ELSE_IF expr slot_r
  public static boolean slot_else_if_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_else_if_start")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && consumeToken(b, KW_ELSE_IF);
    r = r && expr(b, l + 1);
    r = r && slot_r(b, l + 1);
    exit_section_(b, m, SLOT_ELSE_IF_START, r);
    return r;
  }

  /* ********************************************************** */
  // slot_l (inline_normal SEMICOLON?)* inlined_end? slot_r {
  // }
  public static boolean slot_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && slot_expression_1(b, l + 1);
    r = r && slot_expression_2(b, l + 1);
    r = r && slot_r(b, l + 1);
    r = r && slot_expression_4(b, l + 1);
    exit_section_(b, m, SLOT_EXPRESSION, r);
    return r;
  }

  // (inline_normal SEMICOLON?)*
  private static boolean slot_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!slot_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_expression_1", c)) break;
    }
    return true;
  }

  // inline_normal SEMICOLON?
  private static boolean slot_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inline_normal(b, l + 1);
    r = r && slot_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean slot_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression_1_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  // inlined_end?
  private static boolean slot_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_expression_2")) return false;
    inlined_end(b, l + 1);
    return true;
  }

  // {
  // }
  private static boolean slot_expression_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // slot_else statements*
  public static boolean slot_for_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_else")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_FOR_ELSE, null);
    r = slot_else(b, l + 1);
    p = r; // pin = slot_else
    r = r && slot_for_else_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // slot_l (KW_END_FOR|KW_END) slot_r
  public static boolean slot_for_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_end")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && slot_for_end_1(b, l + 1);
    r = r && slot_r(b, l + 1);
    exit_section_(b, m, SLOT_FOR_END, r);
    return r;
  }

  // KW_END_FOR|KW_END
  private static boolean slot_for_end_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_end_1")) return false;
    boolean r;
    r = consumeToken(b, KW_END_FOR);
    if (!r) r = consumeToken(b, KW_END);
    return r;
  }

  /* ********************************************************** */
  // slot_l KW_FOR pattern kw_in expr slot_r
  public static boolean slot_for_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_start")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && consumeToken(b, KW_FOR);
    r = r && pattern(b, l + 1);
    r = r && kw_in(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && slot_r(b, l + 1);
    exit_section_(b, m, SLOT_FOR_START, r);
    return r;
  }

  /* ********************************************************** */
  // slot_for_start statements* slot_for_else? slot_for_end
  public static boolean slot_for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_statement")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_FOR_STATEMENT, null);
    r = slot_for_start(b, l + 1);
    p = r; // pin = slot_for_start
    r = r && report_error_(b, slot_for_statement_1(b, l + 1));
    r = p && report_error_(b, slot_for_statement_2(b, l + 1)) && r;
    r = p && slot_for_end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statements*
  private static boolean slot_for_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_for_statement_1", c)) break;
    }
    return true;
  }

  // slot_for_else?
  private static boolean slot_for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_for_statement_2")) return false;
    slot_for_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // slot_else statements*
  public static boolean slot_if_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_else")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_IF_ELSE, null);
    r = slot_else(b, l + 1);
    p = r; // pin = slot_else
    r = r && slot_if_else_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statements*
  private static boolean slot_if_else_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_else_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_if_else_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // slot_l (KW_END_IF|KW_END) slot_r
  public static boolean slot_if_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_end")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && slot_if_end_1(b, l + 1);
    r = r && slot_r(b, l + 1);
    exit_section_(b, m, SLOT_IF_END, r);
    return r;
  }

  // KW_END_IF|KW_END
  private static boolean slot_if_end_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_end_1")) return false;
    boolean r;
    r = consumeToken(b, KW_END_IF);
    if (!r) r = consumeToken(b, KW_END);
    return r;
  }

  /* ********************************************************** */
  // slot_l KW_IF expr slot_r
  public static boolean slot_if_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_start")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slot_l(b, l + 1);
    r = r && consumeToken(b, KW_IF);
    r = r && expr(b, l + 1);
    r = r && slot_r(b, l + 1);
    exit_section_(b, m, SLOT_IF_START, r);
    return r;
  }

  /* ********************************************************** */
  // slot_if_start statements* slot_else_if* slot_if_else? slot_if_end
  public static boolean slot_if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_statement")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SLOT_IF_STATEMENT, null);
    r = slot_if_start(b, l + 1);
    p = r; // pin = slot_if_start
    r = r && report_error_(b, slot_if_statement_1(b, l + 1));
    r = p && report_error_(b, slot_if_statement_2(b, l + 1)) && r;
    r = p && report_error_(b, slot_if_statement_3(b, l + 1)) && r;
    r = p && slot_if_end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statements*
  private static boolean slot_if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_if_statement_1", c)) break;
    }
    return true;
  }

  // slot_else_if*
  private static boolean slot_if_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!slot_else_if(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_if_statement_2", c)) break;
    }
    return true;
  }

  // slot_if_else?
  private static boolean slot_if_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_if_statement_3")) return false;
    slot_if_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SLOT_START
  public static boolean slot_l(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_l")) return false;
    if (!nextTokenIs(b, SLOT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLOT_START);
    exit_section_(b, m, SLOT_L, r);
    return r;
  }

  /* ********************************************************** */
  // SLOT_END
  public static boolean slot_r(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_r")) return false;
    if (!nextTokenIs(b, SLOT_END)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLOT_END);
    exit_section_(b, m, SLOT_R, r);
    return r;
  }

  /* ********************************************************** */
  // slot_expression
  //     | slot_for_statement
  //     | slot_if_statement
  //     | text_statement
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    if (!nextTokenIs(b, "", SAHA_TEXT, SLOT_START)) return false;
    boolean r;
    r = slot_expression(b, l + 1);
    if (!r) r = slot_for_statement(b, l + 1);
    if (!r) r = slot_if_statement(b, l + 1);
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
  // OPTIONAL
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    if (!nextTokenIs(b, OPTIONAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPTIONAL);
    exit_section_(b, m, SUFFIX, r);
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
  // SAHA_TEXT+
  public static boolean text_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text_statement")) return false;
    if (!nextTokenIs(b, SAHA_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SAHA_TEXT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, SAHA_TEXT)) break;
      if (!empty_element_parsed_guard_(b, "text_statement", c)) break;
    }
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
  // NULL | BOOLEAN | num | string_literal | table | namespace
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
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
}
