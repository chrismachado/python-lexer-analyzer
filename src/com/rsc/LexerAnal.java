/* The following code was generated by JFlex 1.4.3 on 24/01/20 01:32 */

package com.rsc;
import static com.bin.PyTokens.*;
import com.bin.PyTokens;
import com.bin.Token;
import java.util.Hashtable;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.Stack;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24/01/20 01:32 from the specification file
 * <tt>C:/Users/CHRISTIANO/IdeaProjects/PLA/src/com/rsc/pythonLexer.flex</tt>
 */
public class LexerAnal {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int NORMAL = 2;
  public static final int INDENTATION = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\6\2\0\1\3\22\0\1\5\1\16\1\4\1\2"+
    "\1\0\1\14\1\14\1\40\1\21\1\21\1\12\1\11\1\21\1\11"+
    "\1\41\1\13\1\61\1\65\6\66\2\64\1\21\1\21\1\17\1\15"+
    "\1\20\1\0\1\21\1\22\1\63\1\67\1\24\1\70\1\73\3\10"+
    "\1\71\1\10\1\60\1\10\1\23\1\25\2\10\1\26\1\10\1\27"+
    "\1\72\2\10\1\62\2\10\1\21\1\1\1\21\1\21\1\10\1\0"+
    "\1\30\1\51\1\56\1\32\1\42\1\44\1\50\1\47\1\36\1\71"+
    "\1\54\1\43\1\45\1\31\1\33\1\52\1\10\1\34\1\37\1\35"+
    "\1\57\1\10\1\46\1\55\1\53\1\10\1\21\1\14\1\21\1\21"+
    "\100\0\1\1\1\0\1\1\7\0\1\1\3\0\1\1\3\0\1\1"+
    "\1\0\1\1\6\0\1\1\5\0\1\1\1\1\2\0\1\1\3\0"+
    "\1\1\1\1\1\0\1\1\1\1\1\1\1\0\1\1\1\0\1\1"+
    "\1\1\1\1\2\0\1\1\2\0\1\1\1\1\1\0\1\1\uff03\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\1\1\4\1\5"+
    "\3\6\1\1\3\6\14\5\1\1\1\6\12\5\2\7"+
    "\1\5\2\10\1\0\1\11\1\7\2\5\1\6\2\0"+
    "\2\5\1\12\5\5\2\6\1\12\1\5\2\0\1\7"+
    "\20\5\3\11\1\7\2\11\1\7\1\0\1\5\1\7"+
    "\1\0\1\11\1\7\1\0\2\5\1\6\3\5\1\0"+
    "\2\5\1\0\1\7\1\0\17\5\1\0\2\11\2\7"+
    "\1\0\5\7\1\0\1\7\1\5\1\11\2\0\1\11"+
    "\1\7\1\5\1\0\2\5\2\0\1\11\6\5\4\11"+
    "\1\0\4\7\1\11\1\0\1\11\1\0\5\5\1\0"+
    "\2\11\1\0\1\11\1\0\1\3\1\5\2\11\1\3"+
    "\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[187];
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
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\170"+
    "\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u01e0\0\u0294\0\u02d0\0\170"+
    "\0\u030c\0\u0348\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0"+
    "\0\u04ec\0\u0528\0\u0564\0\u05a0\0\u05dc\0\u0618\0\u0654\0\u0690"+
    "\0\u06cc\0\u0708\0\u0744\0\u0780\0\u07bc\0\u07f8\0\u0834\0\u0870"+
    "\0\u08ac\0\u08e8\0\u0924\0\264\0\u0960\0\u099c\0\170\0\u09d8"+
    "\0\u0a14\0\u0a50\0\u01a4\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c"+
    "\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20\0\u01a4"+
    "\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10\0\u0e4c\0\u0e88\0\u0ec4\0\u0f00"+
    "\0\u0f3c\0\u0f78\0\u0fb4\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u10e0"+
    "\0\u111c\0\u1158\0\u1194\0\u11d0\0\u120c\0\u1248\0\u1284\0\u120c"+
    "\0\u12c0\0\u12fc\0\u1338\0\u1374\0\u13b0\0\u13ec\0\u1428\0\u1464"+
    "\0\170\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590\0\u15cc\0\u1608"+
    "\0\u1644\0\u1680\0\u16bc\0\u16f8\0\u1734\0\u1770\0\u17ac\0\u17e8"+
    "\0\u1824\0\u1860\0\u189c\0\u18d8\0\u1914\0\u1950\0\u198c\0\u19c8"+
    "\0\u1a04\0\u1a40\0\u1a7c\0\u1ab8\0\u1af4\0\u1b30\0\u1b6c\0\u1ba8"+
    "\0\u1be4\0\u1c20\0\u1c5c\0\u1c98\0\u1cd4\0\u1d10\0\u1d4c\0\u1d88"+
    "\0\u1dc4\0\u1e00\0\u1e3c\0\u13ec\0\u1e78\0\u1eb4\0\u1ef0\0\u01a4"+
    "\0\u1f2c\0\u1f68\0\u1fa4\0\u1fe0\0\u201c\0\u2058\0\u1734\0\u2094"+
    "\0\u20d0\0\u210c\0\u2148\0\u2184\0\u21c0\0\u21fc\0\u2238\0\u2274"+
    "\0\u22b0\0\u22ec\0\u2328\0\u2364\0\u23a0\0\u23dc\0\u2418\0\u2418"+
    "\0\u2454\0\u2490\0\u24cc\0\u2508\0\u2544\0\u2580\0\u25bc\0\u25f8"+
    "\0\u2634\0\u2670\0\u26ac\0\u1e00\0\u26e8\0\u2724\0\u2760\0\u279c"+
    "\0\u27d8\0\170\0\u2724";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[187];
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
    "\1\3\1\4\1\5\1\6\1\7\3\10\1\11\1\12"+
    "\1\13\1\14\2\12\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\11\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\11\1\35\1\36\1\37"+
    "\1\40\1\41\1\11\1\42\1\11\1\43\1\44\1\45"+
    "\1\46\2\11\1\47\1\50\1\11\1\51\1\11\1\50"+
    "\3\52\3\11\1\50\1\53\74\3\75\0\1\54\6\0"+
    "\1\55\11\0\16\55\2\0\17\55\1\0\2\55\3\0"+
    "\5\55\3\5\1\0\2\5\1\0\65\5\6\0\1\10"+
    "\65\0\3\56\1\57\1\60\1\56\1\0\65\56\1\0"+
    "\1\54\6\0\1\11\11\0\16\11\2\0\32\11\15\0"+
    "\1\20\70\0\1\12\2\0\1\20\71\0\1\12\1\0"+
    "\1\20\73\0\1\20\1\0\1\12\1\20\70\0\1\20"+
    "\2\0\1\12\54\0\1\54\6\0\1\11\11\0\1\11"+
    "\1\61\14\11\2\0\32\11\1\0\1\54\6\0\1\11"+
    "\11\0\3\11\1\62\12\11\2\0\32\11\1\0\1\54"+
    "\6\0\1\11\11\0\4\11\1\63\11\11\2\0\32\11"+
    "\1\0\1\54\2\0\1\64\3\0\1\11\11\0\16\11"+
    "\1\65\1\0\32\11\1\0\1\54\6\0\1\11\11\0"+
    "\12\11\1\66\3\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\7\11\1\67\5\11\1\70\2\0\32\11"+
    "\1\0\1\54\6\0\1\11\11\0\11\11\1\71\4\11"+
    "\2\0\32\11\1\0\1\54\6\0\1\11\11\0\16\11"+
    "\2\0\1\72\31\11\1\0\1\54\6\0\1\11\11\0"+
    "\12\11\1\63\3\11\2\0\32\11\1\0\1\54\2\0"+
    "\1\64\3\0\1\11\11\0\6\11\1\73\7\11\1\65"+
    "\1\0\1\74\31\11\1\0\1\54\6\0\1\11\11\0"+
    "\12\11\1\75\3\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\7\11\1\76\5\11\1\77\2\0\2\11"+
    "\1\100\1\101\26\11\40\102\1\103\33\102\61\0\1\104"+
    "\2\0\3\104\6\0\1\54\6\0\1\11\11\0\7\11"+
    "\1\105\6\11\2\0\1\11\1\106\11\11\1\107\16\11"+
    "\1\0\1\54\6\0\1\11\11\0\6\11\1\110\7\11"+
    "\2\0\32\11\1\0\1\54\6\0\1\11\11\0\11\11"+
    "\1\111\1\112\1\11\1\113\1\11\2\0\32\11\1\0"+
    "\1\54\6\0\1\11\11\0\14\11\1\114\1\11\2\0"+
    "\5\11\1\115\24\11\1\0\1\54\6\0\1\11\11\0"+
    "\16\11\2\0\1\11\1\116\30\11\1\0\1\54\2\0"+
    "\1\64\3\0\1\11\11\0\4\11\1\24\5\11\1\117"+
    "\3\11\1\65\1\0\32\11\1\0\1\54\6\0\1\11"+
    "\11\0\6\11\1\120\3\11\1\121\3\11\2\0\32\11"+
    "\1\0\1\54\6\0\1\11\11\0\14\11\1\122\1\11"+
    "\2\0\32\11\1\0\1\54\6\0\1\11\11\0\11\11"+
    "\1\123\4\11\2\0\1\11\1\124\30\11\1\0\1\54"+
    "\2\0\1\64\3\0\1\11\11\0\4\11\1\24\5\11"+
    "\1\24\3\11\1\65\1\0\32\11\1\0\1\125\6\0"+
    "\1\125\11\0\3\125\1\126\5\125\1\126\4\125\1\0"+
    "\1\104\1\127\1\130\5\125\1\131\3\125\1\132\2\125"+
    "\1\130\1\133\1\132\1\131\1\134\2\133\1\125\1\127"+
    "\1\130\2\125\1\0\1\125\6\0\1\125\11\0\16\125"+
    "\1\0\1\104\1\127\1\130\14\125\1\130\1\52\2\125"+
    "\3\52\1\125\1\127\1\130\2\125\1\0\1\54\6\0"+
    "\1\11\11\0\6\11\1\135\7\11\2\0\32\11\1\0"+
    "\1\54\6\0\1\55\11\0\16\55\2\0\32\55\3\56"+
    "\1\57\1\136\1\56\1\0\65\56\3\137\1\0\1\140"+
    "\1\137\1\0\65\137\1\0\1\54\6\0\1\11\11\0"+
    "\2\11\1\63\13\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\5\11\1\63\10\11\2\0\32\11\3\64"+
    "\1\0\1\141\1\64\1\0\65\64\40\142\1\0\33\142"+
    "\1\0\1\54\6\0\1\11\11\0\16\11\2\0\15\11"+
    "\1\143\14\11\1\0\1\54\6\0\1\11\11\0\10\11"+
    "\1\63\5\11\2\0\32\11\1\0\1\54\6\0\1\11"+
    "\11\0\15\11\1\144\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\13\11\1\145\2\11\2\0\32\11\1\0"+
    "\1\54\6\0\1\11\11\0\16\11\2\0\1\11\2\100"+
    "\27\11\1\0\1\54\6\0\1\11\11\0\14\11\1\146"+
    "\1\11\2\0\32\11\1\0\1\54\6\0\1\11\11\0"+
    "\13\11\1\147\2\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\16\11\2\0\11\11\1\100\20\11\1\0"+
    "\1\54\6\0\1\11\11\0\16\11\2\0\10\11\1\150"+
    "\21\11\1\0\1\54\3\0\1\151\2\0\1\11\11\0"+
    "\7\11\1\152\6\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\16\11\2\0\10\11\1\153\21\11\40\154"+
    "\1\155\33\154\40\156\1\103\33\156\1\0\1\125\6\0"+
    "\1\125\11\0\16\125\2\0\1\127\16\125\1\104\2\125"+
    "\3\104\1\125\1\127\1\130\2\125\1\0\1\54\6\0"+
    "\1\11\11\0\10\11\1\100\5\11\2\0\32\11\1\0"+
    "\1\54\6\0\1\11\11\0\14\11\1\157\1\160\2\0"+
    "\32\11\1\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\1\161\13\11\1\162\15\11\1\0\1\54\6\0\1\11"+
    "\11\0\16\11\2\0\3\11\1\163\26\11\1\0\1\54"+
    "\6\0\1\11\11\0\12\11\1\100\3\11\2\0\32\11"+
    "\1\0\1\54\6\0\1\11\11\0\11\11\1\164\4\11"+
    "\2\0\32\11\1\0\1\54\6\0\1\11\11\0\7\11"+
    "\1\165\6\11\2\0\32\11\1\0\1\54\6\0\1\11"+
    "\11\0\13\11\1\166\2\11\2\0\32\11\1\0\1\54"+
    "\6\0\1\11\11\0\14\11\1\167\1\11\2\0\32\11"+
    "\1\0\1\54\6\0\1\11\11\0\11\11\1\170\4\11"+
    "\2\0\32\11\1\0\1\54\2\0\1\64\3\0\1\11"+
    "\11\0\16\11\1\65\1\0\1\171\31\11\1\0\1\54"+
    "\6\0\1\11\11\0\15\11\1\172\2\0\32\11\1\0"+
    "\1\54\6\0\1\11\11\0\14\11\1\173\1\11\2\0"+
    "\32\11\1\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\1\174\31\11\1\0\1\54\6\0\1\11\11\0\7\11"+
    "\1\175\6\11\2\0\32\11\1\0\1\54\6\0\1\11"+
    "\11\0\6\11\1\120\7\11\2\0\32\11\1\0\1\125"+
    "\6\0\1\125\11\0\16\125\1\0\1\176\17\125\1\177"+
    "\2\125\3\200\5\125\1\0\1\125\6\0\1\125\11\0"+
    "\16\125\1\0\1\176\17\125\1\201\2\125\1\200\2\202"+
    "\5\125\1\0\1\125\6\0\1\125\1\203\10\0\16\125"+
    "\1\0\1\176\17\125\1\177\2\125\3\200\5\125\1\0"+
    "\1\125\6\0\1\125\11\0\16\125\1\0\1\176\17\125"+
    "\1\204\2\125\1\200\1\205\1\200\5\125\1\0\1\125"+
    "\6\0\1\125\11\0\1\206\1\125\1\206\3\125\1\206"+
    "\1\125\1\206\5\125\1\0\1\176\1\206\1\125\1\206"+
    "\4\125\1\206\4\125\1\206\2\125\1\207\1\125\1\206"+
    "\3\210\2\206\2\125\1\206\1\0\1\125\6\0\1\125"+
    "\11\0\16\125\1\0\1\104\1\127\1\130\14\125\1\130"+
    "\1\133\2\125\1\134\2\133\1\125\1\127\1\130\2\125"+
    "\41\0\1\104\1\211\16\0\1\134\2\0\3\134\1\0"+
    "\1\211\1\212\3\0\1\54\6\0\1\11\11\0\16\11"+
    "\2\0\1\11\1\213\30\11\4\0\1\214\67\0\3\137"+
    "\1\0\1\57\1\137\1\0\65\137\3\215\1\216\1\217"+
    "\1\215\1\216\65\215\40\0\1\141\34\0\1\54\6\0"+
    "\1\11\11\0\16\11\2\0\1\220\31\11\1\0\1\54"+
    "\6\0\1\11\11\0\16\11\2\0\1\221\31\11\1\0"+
    "\1\54\3\0\1\222\2\0\1\11\11\0\16\11\2\0"+
    "\32\11\1\0\1\54\6\0\1\11\11\0\15\11\1\160"+
    "\2\0\32\11\1\0\1\54\6\0\1\11\11\0\16\11"+
    "\2\0\15\11\1\223\14\11\1\0\1\54\6\0\1\11"+
    "\11\0\16\11\2\0\15\11\1\224\14\11\31\0\1\225"+
    "\43\0\1\54\6\0\1\11\11\0\16\11\1\226\1\0"+
    "\32\11\1\0\1\54\6\0\1\11\11\0\11\11\1\221"+
    "\4\11\2\0\32\11\40\154\1\227\33\154\40\0\1\227"+
    "\33\0\40\156\1\57\33\156\1\0\1\54\6\0\1\11"+
    "\11\0\16\11\2\0\2\11\1\100\27\11\1\0\1\54"+
    "\6\0\1\11\11\0\16\11\2\0\1\100\31\11\1\0"+
    "\1\54\6\0\1\11\11\0\16\11\2\0\14\11\1\100"+
    "\15\11\1\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\1\230\31\11\1\0\1\54\6\0\1\11\11\0\16\11"+
    "\2\0\7\11\1\231\22\11\1\0\1\54\6\0\1\11"+
    "\11\0\16\11\2\0\3\11\1\100\26\11\1\0\1\54"+
    "\6\0\1\11\11\0\6\11\1\232\7\11\2\0\32\11"+
    "\1\0\1\54\6\0\1\11\11\0\16\11\2\0\5\11"+
    "\1\100\24\11\1\0\1\54\6\0\1\11\11\0\16\11"+
    "\2\0\1\11\1\160\30\11\1\0\1\54\6\0\1\11"+
    "\11\0\16\11\2\0\7\11\1\233\22\11\1\0\1\54"+
    "\6\0\1\11\11\0\6\11\1\234\7\11\2\0\32\11"+
    "\1\0\1\54\6\0\1\11\11\0\15\11\1\100\2\0"+
    "\32\11\1\0\1\54\6\0\1\11\11\0\7\11\1\224"+
    "\6\11\2\0\32\11\1\0\1\54\6\0\1\11\11\0"+
    "\16\11\2\0\1\11\1\105\30\11\1\0\1\54\6\0"+
    "\1\11\11\0\13\11\1\235\2\11\2\0\32\11\61\0"+
    "\1\236\2\0\3\236\6\0\1\125\6\0\1\125\11\0"+
    "\16\125\1\0\1\236\1\237\12\125\1\240\3\125\1\241"+
    "\1\240\1\125\1\242\2\241\1\125\1\237\3\125\1\0"+
    "\1\125\6\0\1\125\11\0\16\125\1\0\1\236\1\237"+
    "\16\125\1\200\2\125\3\200\1\125\1\237\3\125\1\0"+
    "\1\125\6\0\1\125\11\0\16\125\1\0\1\236\1\237"+
    "\1\130\11\125\1\240\2\125\1\130\1\243\1\240\1\125"+
    "\1\242\2\243\1\125\1\237\3\125\1\0\1\125\6\0"+
    "\1\125\11\0\16\125\1\0\1\236\1\237\1\130\14\125"+
    "\1\130\1\202\2\125\1\200\2\202\1\125\1\237\3\125"+
    "\61\0\1\244\2\0\3\244\6\0\1\125\6\0\1\125"+
    "\11\0\16\125\1\0\1\236\1\237\1\130\11\125\1\240"+
    "\2\125\1\130\1\245\1\240\1\125\1\242\1\245\1\241"+
    "\1\125\1\237\3\125\1\0\1\125\6\0\1\125\11\0"+
    "\16\125\1\0\1\236\1\237\1\130\14\125\1\130\1\205"+
    "\2\125\1\200\1\205\1\200\1\125\1\237\3\125\1\0"+
    "\1\125\6\0\1\125\11\0\1\206\1\125\1\206\3\125"+
    "\1\206\1\125\1\206\5\125\1\0\1\176\1\206\1\130"+
    "\1\206\4\125\1\206\4\125\1\206\1\125\1\130\1\207"+
    "\1\125\1\206\3\210\2\206\2\125\1\206\1\0\1\125"+
    "\6\0\1\125\11\0\1\206\1\125\1\206\3\125\1\206"+
    "\1\125\1\206\5\125\1\0\1\236\1\246\1\130\1\206"+
    "\4\125\1\206\3\125\1\240\1\206\1\125\1\130\1\210"+
    "\1\240\1\206\3\210\1\206\1\246\2\125\1\206\1\0"+
    "\1\125\6\0\1\125\11\0\1\206\1\125\1\206\3\125"+
    "\1\206\1\125\1\206\5\125\1\0\1\236\1\246\1\130"+
    "\1\206\4\125\1\206\4\125\1\206\1\125\1\130\1\210"+
    "\1\125\1\206\3\210\1\206\1\246\2\125\1\206\11\0"+
    "\1\203\63\0\1\125\6\0\1\125\11\0\16\125\2\0"+
    "\17\125\1\0\2\125\3\0\5\125\1\0\1\54\6\0"+
    "\1\11\11\0\15\11\1\143\2\0\32\11\3\215\1\216"+
    "\1\247\1\215\1\216\65\215\4\216\1\250\67\216\3\137"+
    "\1\0\1\251\1\137\1\0\65\137\1\0\1\54\6\0"+
    "\1\11\11\0\12\11\1\224\3\11\2\0\32\11\36\0"+
    "\1\252\36\0\1\54\6\0\1\11\11\0\12\11\1\253"+
    "\3\11\2\0\32\11\1\0\1\54\6\0\1\11\11\0"+
    "\13\11\1\100\2\11\2\0\32\11\33\0\1\226\75\0"+
    "\1\20\37\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\10\11\1\224\21\11\1\0\1\54\6\0\1\11\11\0"+
    "\10\11\1\254\5\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\16\11\2\0\1\11\1\255\30\11\1\0"+
    "\1\54\6\0\1\11\11\0\6\11\1\256\7\11\2\0"+
    "\32\11\1\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\12\11\1\100\17\11\1\0\1\54\6\0\1\11\11\0"+
    "\14\11\1\257\1\11\2\0\32\11\1\0\1\125\6\0"+
    "\1\125\11\0\16\125\2\0\1\237\16\125\1\236\2\125"+
    "\3\236\1\125\1\237\3\125\1\0\1\125\6\0\1\125"+
    "\1\260\10\0\16\125\1\0\1\176\17\125\1\177\2\125"+
    "\3\200\5\125\1\0\1\125\6\0\1\125\11\0\1\240"+
    "\1\125\1\240\3\125\1\240\1\125\1\240\5\125\1\0"+
    "\1\176\1\240\1\125\1\240\4\125\1\240\4\125\1\240"+
    "\2\125\1\261\1\125\1\240\3\262\2\240\2\125\1\240"+
    "\1\0\1\125\6\0\1\125\11\0\16\125\1\0\1\236"+
    "\1\237\16\125\1\241\2\125\1\242\2\241\1\125\1\237"+
    "\3\125\41\0\1\236\1\263\16\0\1\242\2\0\3\242"+
    "\1\0\1\263\1\264\3\0\1\125\6\0\1\125\11\0"+
    "\16\125\1\0\1\236\1\237\1\130\14\125\1\130\1\243"+
    "\2\125\1\242\2\243\1\125\1\237\3\125\1\0\1\125"+
    "\6\0\1\125\11\0\16\125\2\0\17\125\1\244\2\125"+
    "\3\244\2\125\1\130\2\125\1\0\1\125\6\0\1\125"+
    "\11\0\16\125\1\0\1\236\1\237\1\130\14\125\1\130"+
    "\1\245\2\125\1\242\1\245\1\241\1\125\1\237\3\125"+
    "\1\0\1\125\6\0\1\125\1\260\10\0\1\206\1\125"+
    "\1\206\3\125\1\206\1\125\1\206\5\125\1\0\1\176"+
    "\1\206\1\130\1\206\4\125\1\206\4\125\1\206\1\125"+
    "\1\130\1\207\1\125\1\206\3\210\2\206\2\125\1\206"+
    "\4\0\1\265\67\0\3\137\1\0\1\266\1\137\1\0"+
    "\65\137\31\0\1\20\43\0\1\54\6\0\1\11\11\0"+
    "\7\11\1\100\6\11\2\0\32\11\1\0\1\54\6\0"+
    "\1\11\11\0\6\11\1\100\7\11\2\0\32\11\1\0"+
    "\1\54\6\0\1\11\11\0\16\11\2\0\1\11\1\75"+
    "\30\11\1\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\1\11\1\100\30\11\1\0\1\54\6\0\1\11\11\0"+
    "\7\11\1\267\6\11\2\0\32\11\61\0\1\270\2\0"+
    "\3\270\6\0\1\125\6\0\1\125\11\0\1\240\1\125"+
    "\1\240\3\125\1\240\1\125\1\240\5\125\1\0\1\236"+
    "\1\271\1\125\1\240\4\125\1\240\3\125\2\240\2\125"+
    "\1\262\2\240\3\262\1\240\1\271\2\125\1\240\1\0"+
    "\1\125\6\0\1\125\11\0\1\240\1\125\1\240\3\125"+
    "\1\240\1\125\1\240\5\125\1\0\1\236\1\271\1\125"+
    "\1\240\4\125\1\240\4\125\1\240\2\125\1\262\1\125"+
    "\1\240\3\262\1\240\1\271\2\125\1\240\11\0\1\260"+
    "\66\0\1\272\67\0\3\137\1\0\1\273\1\137\1\0"+
    "\65\137\1\0\1\54\6\0\1\11\11\0\16\11\2\0"+
    "\15\11\1\160\14\11\1\0\1\125\6\0\1\125\11\0"+
    "\16\125\2\0\17\125\1\270\2\125\3\270\5\125\1\0"+
    "\1\125\6\0\1\125\1\260\10\0\1\240\1\125\1\240"+
    "\3\125\1\240\1\125\1\240\5\125\1\0\1\176\1\240"+
    "\1\125\1\240\4\125\1\240\4\125\1\240\2\125\1\261"+
    "\1\125\1\240\3\262\2\240\2\125\1\240";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10260];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\4\1\1\11\7\1\1\11\35\1\1\0"+
    "\1\11\4\1\2\0\14\1\2\0\30\1\1\0\2\1"+
    "\1\0\1\1\1\11\1\0\6\1\1\0\2\1\1\0"+
    "\1\1\1\0\17\1\1\0\4\1\1\0\5\1\1\0"+
    "\3\1\2\0\3\1\1\0\2\1\2\0\13\1\1\0"+
    "\5\1\1\0\1\1\1\0\5\1\1\0\2\1\1\0"+
    "\1\1\1\0\4\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[187];
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

  /* user code: */
    private Hashtable pyTokensTable = new Hashtable<PyTokens, Integer>();
    private ArrayList<Token> tokens = new ArrayList<Token>();
    private int indentCounter = 0;
    private int indentLevel = 0;
    private boolean validBlock = false;
    private Stack<Integer> lineStack = new Stack<Integer>();

    public LexerAnal(java.io.Reader in, boolean init) {
        this.zzReader = in;
        initHashtable();
    }
    public Hashtable getPyTokensTable() {
        return this.pyTokensTable;
    }
    public String getReviewString() {
        String result = "";
        for (Token token : this.tokens)
           result += token.toString();
        return result;
    }

    public void printReview() {
         for (Token token : this.tokens)
                    System.out.print(token);
         System.out.println();
    }

    private PyTokens pyToken(String value, PyTokens token) {
        try {
            tokens.add(new Token(value, token.toString(), yyline));
            this.pyTokensTable.put(token, new Integer((int) this.pyTokensTable.get(token) + 1));
            return token;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return PyTokens.INVALID;
        }
    }

    private PyTokens verifyIndentation(String value, int line, int column) {
        for(char c : value.toCharArray()) {
            System.out.print(c);
             if (c == '\n') {
                this.indentCounter = 0;
                this.indentLevel++;
                validBlock = true;
                lineStack.push(this.indentCounter + 4);
            } else if (c == ' ' || c == 32) {
                this.indentCounter++;
            } else if (c == '\t') {
                this.indentCounter+=4;
            } else {
                validBlock = false;
            }

            try {
                if (validBlock && indentLevel != 0) {
                    if (this.indentCounter >= (lineStack.lastElement())) {
                        this.pyTokensTable.put(PyTokens.INDENT, new Integer((int) this.pyTokensTable.get(PyTokens.INDENT) + 1));
                        tokens.add(new Token("", PyTokens.INDENT.toString(), line));
                        lineStack.push(this.indentCounter + 3);
                        System.out.print(" I ");
                        return PyTokens.INDENT;
                    }
                }
            } catch (IllegalArgumentException e) {
                        return PyTokens.INVALID;
            }

        }

        return null;
    }

    private void initHashtable() {
        for(PyTokens token : PyTokens.values())
            this.pyTokensTable.put(token, new Integer(0));
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerAnal(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LexerAnal(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 260) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
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
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public PyTokens yylex() throws java.io.IOException {
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
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
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
          yycolumn++;
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.KEYWORD);
          }
        case 11: break;
        case 2: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.INVALID_CHARACTER);
          }
        case 12: break;
        case 8: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.ERROR_IDENTIFIER);
          }
        case 13: break;
        case 1: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken("", PyTokens.BAD_ERROR);
          }
        case 14: break;
        case 9: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.ERROR_LITERAL);
          }
        case 15: break;
        case 4: 
          { verifyIndentation(yytext(), yyline, yycolumn);
          }
        case 16: break;
        case 3: 
          { /*         IGNORE        */
          }
        case 17: break;
        case 7: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.LITERAL);
          }
        case 18: break;
        case 5: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.IDENTIFIER);
          }
        case 19: break;
        case 6: 
          { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.OPERATOR);
          }
        case 20: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
