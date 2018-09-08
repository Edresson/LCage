/* Generated By:JavaCC: Do not edit this line. LCageTokenManager.java */
import java.io.*;

/** Token Manager. */
public class LCageTokenManager implements LCageConstants
{
static int countLexError = 0;
int countParserError = 0;
public int foundLexError()
{
   return countLexError;
}
public int foundParserError()
{
   return countParserError;
}

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 39;
            return 21;
         }
         if ((active0 & 0x3ffa100L) != 0L)
         {
            jjmatchedKind = 36;
            return 48;
         }
         return -1;
      case 1:
         if ((active0 & 0x3fd2100L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 1;
            return 48;
         }
         if ((active0 & 0x28000L) != 0L)
            return 48;
         return -1;
      case 2:
         if ((active0 & 0x3fd2100L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 2;
            return 48;
         }
         return -1;
      case 3:
         if ((active0 & 0x1002100L) != 0L)
            return 48;
         if ((active0 & 0x2fd0000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 3;
            return 48;
         }
         return -1;
      case 4:
         if ((active0 & 0x140000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 4;
            return 48;
         }
         if ((active0 & 0x2e90000L) != 0L)
            return 48;
         return -1;
      case 5:
         if ((active0 & 0x40000L) != 0L)
            return 48;
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 5;
            return 48;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 11);
      case 41:
         return jjStopAtPos(0, 12);
      case 44:
         return jjStopAtPos(0, 26);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 59:
         return jjStopAtPos(0, 14);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2500000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x208000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 123:
         return jjStopAtPos(0, 9);
      case 125:
         return jjStopAtPos(0, 10);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2002100L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0xe10000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 48);
         break;
      case 111:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 48);
         break;
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x1080000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0xe10000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80100L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 48);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 48);
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0xe10000L);
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 48);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 48);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 48);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 48);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 48);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 48);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 48);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 48);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 48);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 48;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x840000d8ffffc9ffL & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(21);
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x5000ac0000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(23, 24);
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 5;
                  if ((0x3ff244a00000000L & l) != 0L)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(18);
                  }
                  else if (curChar == 47)
                     jjAddStates(3, 4);
                  else if (curChar == 39)
                     jjCheckNAddStates(5, 7);
                  else if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 20;
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 48:
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 1:
                  if (curChar == 38 && kind > 28)
                     kind = 28;
                  break;
               case 2:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  if (curChar == 61 && kind > 28)
                     kind = 28;
                  break;
               case 6:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if (curChar == 46)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAddTwoStates(13, 14);
                  break;
               case 15:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(16);
                  break;
               case 17:
                  if ((0x3ff244a00000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if (curChar != 61)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(18);
                  break;
               case 21:
                  if ((0x840000d8ffffc9ffL & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(21);
                  break;
               case 22:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 23:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 24:
                  if ((0x2400L & l) != 0L && kind > 40)
                     kind = 40;
                  break;
               case 25:
                  if (curChar == 39)
                     jjCheckNAddStates(5, 7);
                  break;
               case 26:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 28:
                  if ((0x400002400L & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 29:
                  if (curChar == 39 && kind > 41)
                     kind = 41;
                  break;
               case 30:
                  if (curChar == 10)
                     jjCheckNAddStates(5, 7);
                  break;
               case 31:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 47)
                     jjAddStates(3, 4);
                  break;
               case 33:
                  if (curChar != 47)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 34:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 36:
                  if ((0x8400002400L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 37:
                  if (curChar != 10)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 38:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 42)
                     jjCheckNAddStates(8, 11);
                  break;
               case 40:
                  if ((0x2400L & l) != 0L)
                     jjCheckNAddStates(8, 11);
                  break;
               case 41:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(8, 11);
                  break;
               case 43:
                  if ((0x8400002400L & l) != 0L)
                     jjCheckNAddStates(8, 11);
                  break;
               case 44:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 45:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if (curChar == 10)
                     jjCheckNAddStates(8, 11);
                  break;
               case 47:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddTwoStates(8, 9);
                  }
                  else if ((0xd0000001d0000001L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(21);
                  }
                  if (curChar == 64)
                  {
                     if (kind > 38)
                        kind = 38;
                     jjCheckNAdd(18);
                  }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 48:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddTwoStates(8, 9);
                  }
                  else if (curChar == 95)
                     jjCheckNAdd(10);
                  break;
               case 3:
                  if (curChar == 124 && kind > 28)
                     kind = 28;
                  break;
               case 4:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 95)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 14:
                  if (curChar == 69)
                     jjAddStates(12, 13);
                  break;
               case 17:
                  if (curChar != 64)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(18);
                  break;
               case 21:
                  if ((0xd0000001d0000001L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(21);
                  break;
               case 23:
                  jjAddStates(14, 15);
                  break;
               case 26:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 27:
                  if (curChar == 92)
                     jjAddStates(16, 17);
                  break;
               case 28:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 34:
                  if ((0xffffffffefffffffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 35:
                  if (curChar == 92)
                     jjAddStates(18, 19);
                  break;
               case 36:
                  if ((0x14404410000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 41:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(8, 11);
                  break;
               case 42:
                  if (curChar == 92)
                     jjAddStates(20, 21);
                  break;
               case 43:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(8, 11);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 21:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(21);
                  break;
               case 23:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(14, 15);
                  break;
               case 26:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 7);
                  break;
               case 34:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjAddStates(22, 23);
                  break;
               case 41:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 11);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 48 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   11, 12, 14, 33, 39, 26, 27, 29, 40, 41, 42, 45, 15, 16, 23, 24, 
   28, 31, 36, 38, 43, 47, 34, 35, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\155\141\151\156", "\173", 
"\175", "\50", "\51", "\143\141\147\145", "\73", "\151\146", "\156\143\141\147\145", 
"\144\157", "\162\145\164\165\162\156", "\160\162\151\156\164", 
"\146\165\156\103\141\147\145", "\151\143\141\147\145", "\146\143\141\147\145", "\142\143\141\147\145", 
"\164\162\165\145", "\146\141\154\163\145", "\54", "\72\75", null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x301fffff01L, 
};
static final long[] jjtoSkip = {
   0x3c00000007eL, 
};
static final long[] jjtoSpecial = {
   0x3c000000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[48];
static private final int[] jjstateSet = new int[96];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public LCageTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public LCageTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 48; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
            SkipLexicalActions(matchedToken);
         }
         else
            SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 38 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                     System.out.println("IDENTIFICADOR: "+image);
                                     countLexError++;
                                     System.out.println("\u005cn\u005cnErro lexico -------->  Linha "+ input_stream.getEndLine()+" Coluna "+ input_stream.getEndColumn()+" "+image +"\u005cn");
         break;
      case 39 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
     System.err.println("Linha "+ input_stream.getEndLine()+" Coluna "+ input_stream.getEndColumn()+" Caractere invalido encontrado: " + image + "TOTAL ERRO "+countLexError);
                          countLexError++;
                          System.out.println("Erro Lexico --------> "+image);
                          System.out.println("\u005cn\u005cnErro lexico -------->  Linha "+ input_stream.getEndLine()+" Coluna "+ input_stream.getEndColumn()+" "+image +"\u005cn");
         break;
      case 40 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                      System.err.println("Linha "+ input_stream.getEndLine()+" Coluna "+ input_stream.getEndColumn()+" Caractere invalido encontrado \u005c\u005cn: " + image+" Era esperado uma aspa");
                                     countLexError++;
                                     System.out.println("Erro Lexico --------> "+image);
                                     System.out.println("\u005cn\u005cnErro lexico -------->  Linha "+ input_stream.getEndLine()+" Coluna "+ input_stream.getEndColumn()+" "+image+"\u005cn");
         break;
      case 41 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                     System.out.println("Erro lexico: --------> "+image);
                                     System.out.println("\u005cn\u005cnErro lexico: --------> "+image);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
