/* The following code was generated by JFlex 1.6.1 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/Lexer.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\12\1\4\1\2\2\0\1\1\16\12\4\0\1\3\1\12\1\14"+
    "\1\12\1\12\2\12\1\13\1\47\1\50\1\46\1\44\1\43\1\45"+
    "\1\53\1\11\1\10\11\6\1\40\1\42\1\54\1\41\1\55\2\12"+
    "\5\5\1\16\5\5\1\5\7\5\1\15\6\5\1\56\1\12\1\57"+
    "\1\0\1\7\1\0\1\20\1\32\1\31\1\30\1\24\1\35\1\5"+
    "\1\34\1\21\2\5\1\23\1\17\1\22\1\33\1\26\1\37\1\27"+
    "\1\36\1\25\6\5\1\51\1\0\1\52\1\0\41\12\1\0\1\12"+
    "\4\12\1\0\1\12\2\0\1\12\1\12\1\0\1\12\7\0\1\12"+
    "\2\12\2\0\1\12\1\12\3\0\1\12\27\12\1\0\37\12\1\0"+
    "\u01ca\12\4\0\14\12\16\0\5\12\7\0\1\12\1\0\1\12\21\0"+
    "\165\12\1\0\2\12\2\0\4\12\1\12\7\0\1\12\1\12\3\12"+
    "\1\0\1\12\1\0\24\12\1\0\123\12\1\0\213\12\1\0\5\12"+
    "\2\0\236\12\11\0\46\12\2\0\1\12\6\12\1\0\47\12\1\0"+
    "\2\12\4\0\1\12\1\0\55\12\1\12\1\12\1\12\2\12\1\12"+
    "\2\12\1\12\1\12\10\0\33\12\5\0\3\12\2\12\13\0\5\12"+
    "\4\0\2\12\1\12\2\12\2\0\13\12\1\12\2\0\2\12\112\12"+
    "\4\12\146\12\1\12\11\12\1\0\12\12\1\0\23\12\2\0\1\12"+
    "\16\12\1\0\74\12\2\0\145\12\16\0\66\12\1\0\3\12\1\12"+
    "\5\0\56\12\2\0\17\12\1\0\34\12\2\0\1\12\101\0\1\12"+
    "\1\0\13\12\67\0\33\12\1\0\144\12\2\12\12\12\1\12\7\12"+
    "\1\0\7\12\1\0\3\12\1\0\10\12\2\0\2\12\2\0\26\12"+
    "\1\0\7\12\1\0\1\12\3\0\4\12\2\0\11\12\2\0\2\12"+
    "\2\0\4\12\10\0\1\12\4\0\2\12\1\0\5\12\2\0\16\12"+
    "\7\0\1\12\5\0\3\12\1\0\6\12\4\0\2\12\2\0\26\12"+
    "\1\0\7\12\1\0\2\12\1\0\2\12\1\0\2\12\2\0\1\12"+
    "\1\0\5\12\4\0\2\12\2\0\3\12\3\0\1\12\7\0\4\12"+
    "\1\0\1\12\7\0\20\12\13\0\3\12\1\0\11\12\1\0\3\12"+
    "\1\0\26\12\1\0\7\12\1\0\2\12\1\0\5\12\2\0\12\12"+
    "\1\0\3\12\1\0\3\12\2\0\1\12\17\0\4\12\2\0\12\12"+
    "\1\12\1\12\17\0\3\12\1\0\10\12\2\0\2\12\2\0\26\12"+
    "\1\0\7\12\1\0\2\12\1\0\5\12\2\0\11\12\2\0\2\12"+
    "\2\0\3\12\10\0\2\12\4\0\2\12\1\0\5\12\2\0\12\12"+
    "\1\0\1\12\20\0\2\12\1\0\6\12\3\0\3\12\1\0\4\12"+
    "\3\0\2\12\1\0\1\12\1\0\2\12\3\0\2\12\3\0\3\12"+
    "\3\0\14\12\4\0\5\12\3\0\3\12\1\0\4\12\2\0\1\12"+
    "\6\0\1\12\16\0\12\12\11\0\1\12\7\0\3\12\1\0\10\12"+
    "\1\0\3\12\1\0\27\12\1\0\12\12\1\0\5\12\3\0\10\12"+
    "\1\0\3\12\1\0\4\12\7\0\2\12\1\0\2\12\6\0\4\12"+
    "\2\0\12\12\22\0\2\12\1\0\10\12\1\0\3\12\1\0\27\12"+
    "\1\0\12\12\1\0\5\12\2\0\11\12\1\0\3\12\1\0\4\12"+
    "\7\0\2\12\7\0\1\12\1\0\4\12\2\0\12\12\1\0\2\12"+
    "\17\0\2\12\1\0\10\12\1\0\3\12\1\0\51\12\2\0\10\12"+
    "\1\0\3\12\1\0\5\12\10\0\1\12\10\0\4\12\2\0\12\12"+
    "\12\0\6\12\2\0\2\12\1\0\22\12\3\0\30\12\1\0\11\12"+
    "\1\0\1\12\2\0\7\12\3\0\1\12\4\0\6\12\1\0\1\12"+
    "\1\0\10\12\22\0\2\12\1\12\14\0\72\12\4\0\20\12\1\12"+
    "\12\12\2\12\45\0\2\12\1\0\1\12\2\0\2\12\1\0\1\12"+
    "\2\0\1\12\6\0\4\12\1\0\7\12\1\0\3\12\1\0\1\12"+
    "\1\0\1\12\2\0\2\12\1\0\15\12\1\0\3\12\2\0\5\12"+
    "\1\0\1\12\1\0\6\12\2\0\12\12\2\0\4\12\40\0\1\12"+
    "\3\0\17\12\1\0\1\12\3\0\2\12\6\0\12\12\13\0\1\12"+
    "\1\0\1\12\1\0\1\12\4\12\12\12\1\0\44\12\4\0\24\12"+
    "\1\12\22\12\1\0\44\12\11\0\1\12\11\0\5\12\4\0\2\12"+
    "\45\0\112\12\6\12\116\12\2\0\46\12\1\0\1\12\5\0\1\12"+
    "\2\0\53\12\1\12\u014d\12\1\0\4\12\2\0\7\12\1\0\1\12"+
    "\1\0\4\12\2\0\51\12\1\0\4\12\2\0\41\12\1\0\4\12"+
    "\2\0\7\12\1\0\1\12\1\0\4\12\2\0\17\12\1\0\71\12"+
    "\1\0\4\12\2\0\103\12\2\0\3\12\11\12\27\0\20\12\20\0"+
    "\125\12\13\0\1\12\u026c\12\2\12\21\12\1\0\32\12\2\12\3\0"+
    "\113\12\3\12\3\12\17\0\15\12\1\0\7\12\13\0\25\12\2\12"+
    "\11\0\24\12\14\0\15\12\1\0\3\12\1\0\2\12\14\0\124\12"+
    "\3\12\1\12\3\12\3\12\2\0\12\12\26\0\13\12\3\12\2\0"+
    "\12\12\6\0\130\12\10\0\53\12\5\0\106\12\12\0\35\12\3\0"+
    "\14\12\4\0\14\12\10\0\2\12\50\12\2\0\5\12\13\0\54\12"+
    "\4\0\32\12\6\0\12\12\46\0\34\12\2\0\2\12\77\12\1\0"+
    "\35\12\2\0\13\12\6\0\12\12\6\0\7\12\1\12\6\12\122\0"+
    "\114\12\4\0\12\12\7\12\12\0\11\12\14\0\164\12\10\0\4\12"+
    "\70\12\3\0\5\12\12\12\3\0\61\12\2\12\100\0\10\12\10\0"+
    "\3\12\1\12\43\12\11\0\347\12\25\0\u011a\12\2\0\6\12\2\0"+
    "\46\12\2\0\6\12\2\0\10\12\1\0\1\12\1\0\1\12\1\0"+
    "\1\12\1\0\37\12\2\0\65\12\1\0\7\12\1\0\1\12\3\0"+
    "\3\12\1\0\7\12\3\0\4\12\2\0\6\12\4\0\15\12\5\0"+
    "\3\12\1\0\7\12\16\0\5\12\30\12\2\0\5\12\1\0\17\12"+
    "\2\12\3\12\1\0\15\12\1\0\1\12\1\12\12\12\1\0\5\12"+
    "\5\0\6\12\1\0\1\12\13\0\2\12\1\12\15\0\2\12\1\0"+
    "\15\12\3\0\33\12\25\0\15\12\4\0\1\12\3\0\14\12\21\0"+
    "\1\12\4\0\1\12\2\0\12\12\1\0\1\12\3\0\5\12\6\0"+
    "\1\12\1\0\1\12\1\0\1\12\1\0\4\12\1\0\13\12\2\0"+
    "\4\12\5\0\5\12\4\0\1\12\21\0\51\12\u017f\0\4\12\35\0"+
    "\2\12\u043d\0\16\12\117\0\2\12\37\0\12\12\u0193\0\26\12\77\0"+
    "\4\12\40\0\2\12\u0202\0\57\12\1\0\57\12\1\0\205\12\6\0"+
    "\11\12\5\0\4\12\1\0\2\12\46\12\1\0\1\12\5\0\1\12"+
    "\2\0\70\12\7\0\1\12\1\12\16\0\30\12\11\0\7\12\1\0"+
    "\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0"+
    "\7\12\1\0\7\12\1\0\40\12\57\12\1\12\23\12\u01be\0\3\12"+
    "\1\0\3\12\12\12\2\0\14\12\1\0\17\12\1\12\5\12\2\0"+
    "\5\12\1\12\3\0\126\12\2\0\2\12\2\0\3\12\1\12\132\12"+
    "\1\12\4\12\5\0\51\12\3\0\136\12\21\0\33\12\65\0\20\12"+
    "\u0200\0\u19b6\12\112\0\u51cd\12\63\0\u048d\12\103\0\56\12\2\12\u010d\12"+
    "\3\12\34\12\24\0\60\12\3\0\1\12\12\12\1\12\31\12\7\0"+
    "\123\12\6\12\37\0\11\12\2\0\147\12\2\0\4\12\1\0\4\12"+
    "\14\0\13\12\115\0\60\12\20\0\1\12\7\0\64\12\4\12\10\0"+
    "\105\12\11\0\2\12\12\12\6\0\30\12\3\12\1\12\4\0\56\12"+
    "\2\12\44\12\13\0\1\12\35\12\3\0\101\12\15\12\1\0\13\12"+
    "\4\0\2\12\40\0\67\12\11\0\16\12\2\0\12\12\2\0\4\12"+
    "\27\12\3\0\2\12\4\0\103\12\30\0\3\12\2\12\20\12\2\12"+
    "\5\12\12\0\6\12\2\0\6\12\2\0\6\12\11\0\7\12\1\0"+
    "\7\12\221\0\53\12\1\12\2\12\2\0\12\12\6\0\u2ba4\12\14\0"+
    "\27\12\4\0\61\12\u2104\0\u016e\12\2\0\152\12\46\0\7\12\14\0"+
    "\5\12\5\0\14\12\1\0\15\12\1\0\5\12\1\0\1\12\1\0"+
    "\2\12\1\0\2\12\1\0\154\12\41\0\u016b\12\2\12\20\0\100\12"+
    "\2\0\66\12\50\0\15\12\3\0\20\12\12\12\6\0\7\12\11\0"+
    "\3\12\2\12\30\12\3\12\3\12\1\0\16\12\1\0\1\12\4\0"+
    "\1\12\1\12\2\12\4\0\5\12\1\0\207\12\2\0\1\12\1\0"+
    "\3\12\1\12\6\12\1\0\4\12\12\12\2\12\3\0\2\12\32\12"+
    "\3\12\1\0\1\12\1\0\32\12\1\12\1\0\1\12\1\0\7\12"+
    "\131\12\3\0\6\12\2\0\6\12\2\0\6\12\2\0\3\12\3\0"+
    "\2\12\3\0\2\12\22\0\3\12\4\0\14\12\1\0\32\12\1\0"+
    "\23\12\1\0\2\12\1\0\17\12\2\0\16\12\42\0\173\12\5\0"+
    "\3\12\75\0\65\12\210\0\1\12\202\0\35\12\3\0\61\12\57\0"+
    "\37\12\21\0\33\12\65\0\36\12\1\0\1\12\44\12\4\0\10\12"+
    "\1\12\5\12\52\0\236\12\2\0\12\12\305\0\1\12\u0290\0\6\12"+
    "\2\0\1\12\1\0\54\12\1\0\2\12\3\0\1\12\2\0\27\12"+
    "\1\0\1\12\250\0\26\12\11\0\1\12\32\12\5\0\1\12\100\0"+
    "\70\12\6\0\2\12\100\0\4\12\1\0\2\12\5\0\10\12\1\0"+
    "\3\12\1\0\33\12\4\0\3\12\4\0\1\12\20\0\11\12\7\0"+
    "\35\12\2\0\1\12\160\0\7\12\11\0\66\12\3\0\7\12\26\12"+
    "\12\0\23\12\46\0\4\12\143\0\111\12\u03b7\0\107\12\7\12\30\0"+
    "\12\12\20\0\73\12\2\12\1\12\4\12\16\0\31\12\7\0\12\12"+
    "\6\0\65\12\1\0\12\12\4\12\60\0\2\12\12\0\105\12\4\12"+
    "\4\0\1\12\2\0\12\12\136\0\6\12\u0288\0\1\12\372\0\11\12"+
    "\167\0\3\12\74\0\70\12\10\0\12\12\u0936\0\u036f\12\221\0\143\12"+
    "\15\0\5\12\u0b8b\0\u042f\12\u33d1\0\u0239\12\65\0\2\12\205\0\1\12"+
    "\101\0\5\12\10\0\1\12\u03bb\0\105\12\13\0\57\12\20\0\21\12"+
    "\u4060\0\2\12\u0c9d\0\1\12\u14c5\0\5\12\3\0\26\12\2\0\7\12"+
    "\36\0\4\12\224\0\3\12\u01bb\0\125\12\1\0\107\12\1\0\2\12"+
    "\2\0\1\12\2\0\2\12\2\0\4\12\1\0\14\12\1\0\1\12"+
    "\1\0\7\12\1\0\101\12\1\0\4\12\2\0\10\12\1\0\7\12"+
    "\1\0\34\12\1\0\4\12\1\0\5\12\1\0\1\12\3\0\7\12"+
    "\1\0\u0154\12\2\0\31\12\1\0\31\12\1\0\37\12\1\0\31\12"+
    "\1\0\37\12\1\0\31\12\1\0\37\12\1\0\31\12\1\0\37\12"+
    "\1\0\31\12\1\0\10\12\2\0\62\12\u1600\0\4\12\1\0\33\12"+
    "\1\0\2\12\1\0\1\12\2\0\1\12\1\0\12\12\1\0\4\12"+
    "\1\0\1\12\1\0\1\12\6\0\1\12\4\0\1\12\1\0\1\12"+
    "\1\0\1\12\1\0\3\12\1\0\2\12\1\0\1\12\2\0\1\12"+
    "\1\0\1\12\1\0\1\12\1\0\1\12\1\0\1\12\1\0\2\12"+
    "\1\0\1\12\2\0\4\12\1\0\7\12\1\0\4\12\1\0\4\12"+
    "\1\0\1\12\1\0\12\12\1\0\21\12\5\0\3\12\1\0\5\12"+
    "\1\0\21\12\u1144\0\ua6d7\12\51\0\u1035\12\13\0\336\12\u3fe2\0\u021e\12"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\12\36\0\140\12\200\0\360\12\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\4\1\6"+
    "\2\1\1\7\1\10\13\3\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\2\0\1\30\13\3\1\31\1\32"+
    "\1\3\1\33\1\34\1\35\1\36\1\3\1\37\4\3"+
    "\1\40\1\41\1\3\1\42\1\43\1\44\1\3\1\45"+
    "\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\60\0\220\0\300\0\60\0\60"+
    "\0\60\0\360\0\u0120\0\220\0\220\0\u0150\0\u0180\0\u01b0"+
    "\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330"+
    "\0\u0360\0\60\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\u0390"+
    "\0\u0120\0\u0120\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0"+
    "\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0\0\60\0\60\0\u05d0"+
    "\0\220\0\220\0\220\0\220\0\u0600\0\220\0\u0630\0\u0660"+
    "\0\u0690\0\u06c0\0\220\0\220\0\u06f0\0\220\0\220\0\220"+
    "\0\u0720\0\220\0\220";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\3\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\14\1\15\1\16\1\5\1\17"+
    "\1\5\1\20\1\5\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\2\5\1\27\1\30\1\5\1\31\1\2\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\62\0\1\4\62\0"+
    "\4\5\4\0\23\5\26\0\1\6\1\0\1\6\52\0"+
    "\1\50\1\0\34\50\1\0\2\50\1\0\7\50\2\0"+
    "\2\50\3\0\1\51\1\0\7\51\1\52\24\51\1\0"+
    "\2\51\1\0\7\51\2\0\2\51\5\0\4\5\4\0"+
    "\3\5\1\53\17\5\25\0\4\5\4\0\5\5\1\54"+
    "\15\5\25\0\4\5\4\0\7\5\1\55\13\5\25\0"+
    "\4\5\4\0\16\5\1\56\4\5\25\0\4\5\4\0"+
    "\12\5\1\57\10\5\25\0\4\5\4\0\3\5\1\60"+
    "\17\5\25\0\4\5\4\0\4\5\1\61\16\5\25\0"+
    "\4\5\4\0\17\5\1\62\3\5\25\0\4\5\4\0"+
    "\16\5\1\63\4\5\25\0\4\5\4\0\6\5\1\64"+
    "\14\5\25\0\4\5\4\0\7\5\1\65\13\5\61\0"+
    "\1\66\31\0\1\67\51\0\4\5\4\0\4\5\1\70"+
    "\16\5\25\0\4\5\4\0\10\5\1\71\12\5\25\0"+
    "\4\5\4\0\5\5\1\72\2\5\1\73\12\5\25\0"+
    "\4\5\4\0\11\5\1\74\11\5\25\0\4\5\4\0"+
    "\4\5\1\75\16\5\25\0\4\5\4\0\10\5\1\76"+
    "\12\5\25\0\4\5\4\0\14\5\1\77\6\5\25\0"+
    "\4\5\4\0\3\5\1\100\17\5\25\0\4\5\4\0"+
    "\16\5\1\101\4\5\25\0\4\5\4\0\16\5\1\102"+
    "\4\5\25\0\4\5\4\0\22\5\1\103\25\0\4\5"+
    "\4\0\5\5\1\104\15\5\25\0\4\5\4\0\5\5"+
    "\1\105\15\5\25\0\4\5\4\0\10\5\1\106\12\5"+
    "\25\0\4\5\4\0\12\5\1\107\10\5\25\0\4\5"+
    "\4\0\6\5\1\110\14\5\25\0\4\5\4\0\3\5"+
    "\1\111\17\5\25\0\4\5\4\0\10\5\1\112\12\5"+
    "\25\0\4\5\4\0\10\5\1\113\12\5\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1872];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\3\11\20\1\16\11"+
    "\2\0\14\1\2\11\24\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }
  public  void    debug(boolean mode){ debug_mode = mode; }

//  Function print_lexeme
  private void print_lexeme(int type, Object value){
    if(!debug()){ return; }

    System.out.print("<");
    switch(type){
      case sym.LET:
        System.out.print("LET"); break;
      case sym.EQUAL:
        System.out.print(":="); break;
      case sym.SEMICOL:
        System.out.print(";"); break;
      case sym.PLUS:
        System.out.print("+"); break;
      case sym.MINUS:
        System.out.print("-"); break;
      case sym.MULT:
        System.out.print("*"); break;
      case sym.DIV:
        System.out.print("/"); break;
      case sym.LPAREN:
        System.out.print("("); break;
      case sym.RPAREN:
        System.out.print(")"); break;
      case sym.INTEGER:
        System.out.printf("INT %d", value); break;
      case sym.IDENTIFIER:
        System.out.printf("IDENT %s", value); break;
      case sym.MAIN:
        System.out.print("main"); break;
      case sym.LBRA:
            System.out.print("{"); break;
      case sym.RBRA:
            System.out.print("}"); break;
      case sym.PRINT:
            System.out.print("print"); break;
      case sym.CHAR:
            System.out.printf("CHAR %c", value); break;


    }
    System.out.print(">  ");
  }

  private Symbol symbol(int type) {
    print_lexeme(type, null);
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    print_lexeme(type, value);
    return new Symbol(type, yyline, yycolumn, value);
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2820) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
            }
          case 39: break;
          case 2: 
            { /* do nothing */
            }
          case 40: break;
          case 3: 
            { return symbol(sym.IDENTIFIER, yytext());
            }
          case 41: break;
          case 4: 
            { return symbol(sym.INTEGER,Integer.parseInt(yytext()));
            }
          case 42: break;
          case 5: 
            { return symbol(sym.UNDERSCORE);
            }
          case 43: break;
          case 6: 
            { return symbol(sym.DIV);
            }
          case 44: break;
          case 7: 
            { return symbol(sym.TRUE);
            }
          case 45: break;
          case 8: 
            { return symbol(sym.FALSE);
            }
          case 46: break;
          case 9: 
            { return symbol(sym.COLON);
            }
          case 47: break;
          case 10: 
            { return symbol(sym.SEMICOL);
            }
          case 48: break;
          case 11: 
            { return symbol(sym.COMMA);
            }
          case 49: break;
          case 12: 
            { return symbol(sym.PLUS);
            }
          case 50: break;
          case 13: 
            { return symbol(sym.MINUS);
            }
          case 51: break;
          case 14: 
            { return symbol(sym.MULT);
            }
          case 52: break;
          case 15: 
            { return symbol(sym.LPAREN);
            }
          case 53: break;
          case 16: 
            { return symbol(sym.RPAREN);
            }
          case 54: break;
          case 17: 
            { return symbol(sym.LBRA);
            }
          case 55: break;
          case 18: 
            { return symbol(sym.RBRA);
            }
          case 56: break;
          case 19: 
            { return symbol(sym.DOT);
            }
          case 57: break;
          case 20: 
            { return symbol(sym.LCROCHET);
            }
          case 58: break;
          case 21: 
            { return symbol(sym.RCROCHET);
            }
          case 59: break;
          case 22: 
            { return symbol(sym.LAGRA);
            }
          case 60: break;
          case 23: 
            { return symbol(sym.RAGRA);
            }
          case 61: break;
          case 24: 
            { return symbol(sym.STRING);
            }
          case 62: break;
          case 25: 
            { return symbol(sym.EQUAL);
            }
          case 63: break;
          case 26: 
            { return symbol(sym.CHAR);
            }
          case 64: break;
          case 27: 
            { return symbol(sym.TYPE_INT);
            }
          case 65: break;
          case 28: 
            { return symbol(sym.LEN);
            }
          case 66: break;
          case 29: 
            { return symbol(sym.LET);
            }
          case 67: break;
          case 30: 
            { return symbol(sym.TOP);
            }
          case 68: break;
          case 31: 
            { return symbol(sym.TYPE_RAT);
            }
          case 69: break;
          case 32: 
            { return symbol(sym.SEQ);
            }
          case 70: break;
          case 33: 
            { return symbol(sym.MAIN);
            }
          case 71: break;
          case 34: 
            { return symbol(sym.DICT);
            }
          case 72: break;
          case 35: 
            { return symbol(sym.TYPE_CHAR);
            }
          case 73: break;
          case 36: 
            { return symbol(sym.TYPE_BOOL);
            }
          case 74: break;
          case 37: 
            { return symbol(sym.PRINT);
            }
          case 75: break;
          case 38: 
            { return symbol(sym.TYPE_FLOAT);
            }
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}