package com.jagex;/* com.jagex.Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class22
{
  public static int anInt288 = 3;
  public byte[][][] aByteArrayArrayArray289;
  public int[][][] anIntArrayArrayArray290;
  public static final int[] anIntArray291 = { 1, 0, -1, 0 };
  public int[] anIntArray292;
  public int[] anIntArray293;
  public int[] anIntArray294;
  public int[] anIntArray295;
  public int[] anIntArray296;
  public static final int[] anIntArray297 = { 16, 32, 64, 128 };
  public byte[][][] aByteArrayArrayArray298;
  public byte[][][] aByteArrayArrayArray299;
  public static int anInt300 = 99;
  public int anInt301;
  public int anInt302;
  public byte[][][] aByteArrayArrayArray303;
  public int anInt304 = 823;
  public static boolean aBoolean305 = true;
  public static int anInt306;
  public int[][] anIntArrayArray307;
  public static final int[] anIntArray308 = { 1, 2, 4, 8 };
  public static final int[] anIntArray309 = { 0, -1, 0, 1 };
  public int[][][] anIntArrayArrayArray310;
  public byte[][][] aByteArrayArrayArray311;
  public int anInt312 = 45492;
  public static int anInt313 = (int) (Math.random () * 33.0) - 16;
  public int anInt314 = -17707;
  public static int anInt315 = (int) (Math.random () * 17.0) - 8;
  public byte[][][] aByteArrayArrayArray316;
  public boolean aBoolean317 = true;
  public static boolean aBoolean318 = true;
  
  public Class22 (byte i, int i_0_, int i_1_, byte[][][] is, int[][][] is_2_)
  {
    anInt300 = 99;
    anInt301 = i_0_;
    anInt302 = i_1_;
    anIntArrayArrayArray310 = is_2_;
    aByteArrayArrayArray316 = is;
    aByteArrayArrayArray303 = new byte[4][anInt301][anInt302];
    aByteArrayArrayArray289 = new byte[4][anInt301][anInt302];
    aByteArrayArrayArray299 = new byte[4][anInt301][anInt302];
    aByteArrayArrayArray311 = new byte[4][anInt301][anInt302];
    anIntArrayArrayArray290 = new int[4][anInt301 + 1][anInt302 + 1];
    aByteArrayArrayArray298 = new byte[4][anInt301 + 1][anInt302 + 1];
    if (i != 102)
      throw new NullPointerException ();
    anIntArrayArray307 = new int[anInt301 + 1][anInt302 + 1];
    anIntArray292 = new int[anInt302];
    anIntArray293 = new int[anInt302];
    anIntArray294 = new int[anInt302];
    anIntArray295 = new int[anInt302];
    anIntArray296 = new int[anInt302];
  }
  
  public static int method244 (int i, int i_3_, int i_4_)
  {
    int i_5_ = i / i_4_;
    int i_6_ = i & i_4_ - 1;
    int i_7_ = i_3_ / i_4_;
    int i_8_ = i_3_ & i_4_ - 1;
    int i_9_ = method259 (i_5_, i_7_);
    int i_10_ = method259 (i_5_ + 1, i_7_);
    int i_11_ = method259 (i_5_, i_7_ + 1);
    int i_12_ = method259 (i_5_ + 1, i_7_ + 1);
    int i_13_ = method258 (i_9_, i_10_, i_6_, i_4_);
    int i_14_ = method258 (i_11_, i_12_, i_6_, i_4_);
    return method258 (i_13_, i_14_, i_8_, i_4_);
  }
  
  public void method245 (int i, int i_15_, int i_16_, int i_17_, int i_18_,
			 byte i_19_, int i_20_, byte[] is, Class3[] class3s,
			 int i_21_)
  {
    for (int i_22_ = 0; i_22_ < 8; i_22_++)
      {
	for (int i_23_ = 0; i_23_ < 8; i_23_++)
	  {
	    if (i + i_22_ > 0 && i + i_22_ < 103 && i_18_ + i_23_ > 0
		&& i_18_ + i_23_ < 103)
	      class3s[i_20_].anIntArrayArray59[i + i_22_][i_18_ + i_23_]
		&= ~0x1000000;
	  }
      }
    Buffer class39_sub3_sub3
      = new Buffer(is);
    for (int i_24_ = 0; i_24_ < 4; i_24_++)
      {
	for (int i_25_ = 0; i_25_ < 64; i_25_++)
	  {
	    for (int i_26_ = 0; i_26_ < 64; i_26_++)
	      {
		if (i_24_ == i_21_ && i_25_ >= i_16_ && i_25_ < i_16_ + 8
		    && i_26_ >= i_17_ && i_26_ < i_17_ + 8)
		  method249 (i_20_, true, 0,
			     i_18_ + Class1.method154 (i_15_, anInt314,
						       i_26_ & 0x7,
						       i_25_ & 0x7),
			     0,
			     i + Class1.method153 (i_26_ & 0x7, i_15_,
						   (byte) -68, i_25_ & 0x7),
			     i_15_, class39_sub3_sub3);
		else
		  method249 (0, true, 0, -1, 0, -1, 0, class39_sub3_sub3);
	      }
	  }
      }
    if (i_19_ == -111)
      {
	/* empty */
      }
  }
  
  public void method246 (Class3[] class3s, byte[] is, int i, int i_27_,
			 int i_28_, int i_29_, int i_30_, int i_31_, int i_32_,
			 int i_33_, Class31 class31)
  {
    Buffer class39_sub3_sub3
      = new Buffer(is);
    if (i_30_ != 0)
      aBoolean317 = ! aBoolean317;
    int i_34_ = -1;
    for (;;)
      {
	int i_35_ = class39_sub3_sub3.readUSmart();
	if (i_35_ == 0)
	  break;
	i_34_ += i_35_;
	int i_36_ = 0;
	for (;;)
	  {
	    int i_37_ = class39_sub3_sub3.readUSmart();
	    if (i_37_ == 0)
	      break;
	    i_36_ += i_37_ - 1;
	    int i_38_ = i_36_ & 0x3f;
	    int i_39_ = i_36_ >> 6 & 0x3f;
	    int i_40_ = i_36_ >> 12;
	    int i_41_ = class39_sub3_sub3.readUByte();
	    int i_42_ = i_41_ >> 2;
	    int i_43_ = i_41_ & 0x3;
	    if (i_40_ == i_28_ && i_39_ >= i && i_39_ < i + 8 && i_38_ >= i_27_
		&& i_38_ < i_27_ + 8)
	      {
		Class27 class27 = Class27.method272 (i_34_);
		int i_44_
		  = i_29_ + Class1.method155 (class27.anInt405, i_38_ & 0x7,
					      class27.anInt395, (byte) 101,
					      i_43_, i_39_ & 0x7, i_33_);
		int i_45_
		  = i_32_ + Class1.method156 (i_43_, i_38_ & 0x7, true,
					      class27.anInt405, i_33_,
					      i_39_ & 0x7, class27.anInt395);
		if (i_44_ > 0 && i_45_ > 0 && i_44_ < 103 && i_45_ < 103)
		  {
		    int i_46_ = i_31_;
		    if ((aByteArrayArrayArray316[1][i_44_][i_45_] & 0x2) == 2)
		      i_46_--;
		    Class3 class3 = null;
		    if (i_46_ >= 0)
		      class3 = class3s[i_46_];
		    method255 (i_42_, class3, class31, i_34_, i_44_,
			       i_43_ + i_33_ & 0x3, i_45_, i_31_, -127);
		  }
	      }
	  }
      }
  }
  
  public int method247 (int i, int i_47_, int i_48_)
  {
    if (i_48_ > 179)
      i_47_ /= 2;
    if (i_48_ > 192)
      i_47_ /= 2;
    if (i_48_ > 217)
      i_47_ /= 2;
    if (i_48_ > 243)
      i_47_ /= 2;
    int i_49_ = (i / 4 << 10) + (i_47_ / 32 << 7) + i_48_ / 2;
    return i_49_;
  }
  
  public static boolean method248 (int i, int i_50_, int i_51_)
  {
    Class27 class27 = Class27.method272 (i);
    if (i_50_ != 0)
      {
	for (int i_52_ = 1; i_52_ > 0; i_52_++)
	  {
	    /* empty */
	  }
      }
    if (i_51_ == 11)
      i_51_ = 10;
    if (i_51_ >= 5 && i_51_ <= 8)
      i_51_ = 4;
    return class27.method278 ((byte) -113, i_51_);
  }
  
  public void method249 (int i, boolean bool, int i_53_, int i_54_, int i_55_,
			 int i_56_, int i_57_,
			 Buffer class39_sub3_sub3)
  {
    if (! bool)
      aBoolean317 = ! aBoolean317;
    if (i_56_ >= 0 && i_56_ < 104 && i_54_ >= 0 && i_54_ < 104)
      {
	aByteArrayArrayArray316[i][i_56_][i_54_] = (byte) 0;
	for (;;)
	  {
	    int i_58_ = class39_sub3_sub3.readUByte();
	    if (i_58_ == 0)
	      {
		if (i == 0)
		  anIntArrayArrayArray310[0][i_56_][i_54_]
		    = - method263 (932731 + i_56_ + i_53_,
				   556238 + i_54_ + i_55_) * 8;
		else
		  {
		    anIntArrayArrayArray310[i][i_56_][i_54_]
		      = anIntArrayArrayArray310[i - 1][i_56_][i_54_] - 240;
		    break;
		  }
		break;
	      }
	    if (i_58_ == 1)
	      {
		int i_59_ = class39_sub3_sub3.readUByte();
		if (i_59_ == 1)
		  i_59_ = 0;
		if (i == 0)
		  anIntArrayArrayArray310[0][i_56_][i_54_] = - i_59_ * 8;
		else
		  {
		    anIntArrayArrayArray310[i][i_56_][i_54_]
		      = (anIntArrayArrayArray310[i - 1][i_56_][i_54_]
			 - i_59_ * 8);
		    break;
		  }
		break;
	      }
	    if (i_58_ <= 49)
	      {
		aByteArrayArrayArray289[i][i_56_][i_54_]
		  = class39_sub3_sub3.readByte();
		aByteArrayArrayArray299[i][i_56_][i_54_]
		  = (byte) ((i_58_ - 2) / 4);
		aByteArrayArrayArray311[i][i_56_][i_54_]
		  = (byte) (i_58_ - 2 + i_57_ & 0x3);
	      }
	    else if (i_58_ <= 81)
	      aByteArrayArrayArray316[i][i_56_][i_54_] = (byte) (i_58_ - 49);
	    else
	      aByteArrayArrayArray303[i][i_56_][i_54_] = (byte) (i_58_ - 81);
	  }
      }
    else
      {
	for (;;)
	  {
	    int i_60_ = class39_sub3_sub3.readUByte();
	    if (i_60_ == 0)
	      break;
	    if (i_60_ == 1)
	      {
		class39_sub3_sub3.readUByte();
		break;
	      }
	    if (i_60_ <= 49)
	      class39_sub3_sub3.readUByte();
	  }
      }
  }
  
  public static int method250 (int i, int i_61_)
  {
    int i_62_ = i + i_61_ * 57;
    i_62_ = i_62_ << 13 ^ i_62_;
    int i_63_
      = i_62_ * (i_62_ * i_62_ * 15731 + 789221) + 1376312589 & 0x7fffffff;
    return i_63_ >> 19 & 0xff;
  }
  
  public static void method251 (boolean bool,
				Buffer class39_sub3_sub3,
				OnDemandClient onDemandClient)
  {
    int i = -1;
    if (bool)
      {
	for (;;)
	  {
	    int i_64_ = class39_sub3_sub3.readUSmart();
	    if (i_64_ == 0)
	      break;
	    i += i_64_;
	    Class27 class27 = Class27.method272 (i);
	    class27.method273 ((byte) 8, onDemandClient);
	    for (;;)
	      {
		int i_65_ = class39_sub3_sub3.readUSmart();
		if (i_65_ == 0)
		  break;
		class39_sub3_sub3.readUByte();
	      }
	  }
      }
  }
  
  public void method252 (byte[] is, int i, boolean bool, int i_66_,
			 Class31 class31, Class3[] class3s)
  {
    if (! bool)
      {
	for (int i_67_ = 1; i_67_ > 0; i_67_++)
	  {
	    /* empty */
	  }
      }
    Buffer class39_sub3_sub3
      = new Buffer(is);
    int i_68_ = -1;
    for (;;)
      {
	int i_69_ = class39_sub3_sub3.readUSmart();
	if (i_69_ == 0)
	  break;
	i_68_ += i_69_;
	int i_70_ = 0;
	for (;;)
	  {
	    int i_71_ = class39_sub3_sub3.readUSmart();
	    if (i_71_ == 0)
	      break;
	    i_70_ += i_71_ - 1;
	    int i_72_ = i_70_ & 0x3f;
	    int i_73_ = i_70_ >> 6 & 0x3f;
	    int i_74_ = i_70_ >> 12;
	    int i_75_ = class39_sub3_sub3.readUByte();
	    int i_76_ = i_75_ >> 2;
	    int i_77_ = i_75_ & 0x3;
	    int i_78_ = i_73_ + i_66_;
	    int i_79_ = i_72_ + i;
	    if (i_78_ > 0 && i_79_ > 0 && i_78_ < 103 && i_79_ < 103)
	      {
		int i_80_ = i_74_;
		if ((aByteArrayArrayArray316[1][i_78_][i_79_] & 0x2) == 2)
		  i_80_--;
		Class3 class3 = null;
		if (i_80_ >= 0)
		  class3 = class3s[i_80_];
		method255 (i_76_, class3, class31, i_68_, i_78_, i_77_, i_79_,
			   i_74_, -127);
	      }
	  }
      }
  }
  
  public int method253 (int i, int i_81_, int i_82_, int i_83_)
  {
    if (i_83_ <= 0)
      anInt288 = -266;
    if ((aByteArrayArrayArray316[i_82_][i][i_81_] & 0x8) != 0)
      return 0;
    if (i_82_ > 0 && (aByteArrayArrayArray316[1][i][i_81_] & 0x2) != 0)
      return i_82_ - 1;
    return i_82_;
  }
  
  public static void method254 (Class31 class31, int i, int i_84_, int i_85_,
				Class3 class3, int i_86_, int i_87_,
				int[][][] is, int i_88_, int i_89_, int i_90_)
  {
    int i_91_ = is[i][i_90_][i_89_];
    int i_92_ = is[i][i_90_ + 1][i_89_];
    int i_93_ = is[i][i_90_ + 1][i_89_ + 1];
    int i_94_ = is[i][i_90_][i_89_ + 1];
    int i_95_ = i_91_ + i_92_ + i_93_ + i_94_ >> 2;
    Class27 class27 = Class27.method272 (i_88_);
    int i_96_ = i_90_ + (i_89_ << 7) + (i_88_ << 14) + 1073741824;
    if (! class27.aBoolean377)
      i_96_ += -2147483648;
    byte i_97_ = (byte) ((i_86_ << 6) + i_85_);
    if (i_87_ <= 0)
      {
	for (int i_98_ = 1; i_98_ > 0; i_98_++)
	  {
	    /* empty */
	  }
      }
    if (i_85_ == 22)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (22, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, 22,
					  i_91_, class27.anInt368, true, true,
					  i_88_);
	class31.method297 (i_89_, i_97_, i_84_, i_90_, class39_sub3_sub2,
			   i_95_, 3, i_96_);
	if (class27.aBoolean390 && class27.aBoolean377)
	  class3.method160 (i_90_, i_89_, true);
      }
    else if (i_85_ == 10 || i_85_ == 11)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (10, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, 10,
					  i_91_, class27.anInt368, true, true,
					  i_88_);
	if (class39_sub3_sub2 != null)
	  {
	    int i_99_ = 0;
	    if (i_85_ == 11)
	      i_99_ += 256;
	    int i_100_;
	    int i_101_;
	    if (i_86_ == 1 || i_86_ == 3)
	      {
		i_100_ = class27.anInt395;
		i_101_ = class27.anInt405;
	      }
	    else
	      {
		i_100_ = class27.anInt405;
		i_101_ = class27.anInt395;
	      }
	    class31.method301 (i_90_, i_100_, i_97_, i_84_, i_101_, i_99_,
			       i_95_, i_89_, (byte) 2, class39_sub3_sub2,
			       i_96_);
	  }
	if (class27.aBoolean390)
	  class3.method159 (i_89_, i_86_, i_90_, (byte) 2, class27.aBoolean362,
			    class27.anInt395, class27.anInt405);
      }
    else if (i_85_ >= 12)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (i_85_, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, i_85_,
					  i_91_, class27.anInt368, true, true,
					  i_88_);
	class31.method301 (i_90_, 1, i_97_, i_84_, 1, 0, i_95_, i_89_,
			   (byte) 2, class39_sub3_sub2, i_96_);
	if (class27.aBoolean390)
	  class3.method159 (i_89_, i_86_, i_90_, (byte) 2, class27.aBoolean362,
			    class27.anInt395, class27.anInt405);
      }
    else if (i_85_ == 0)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (0, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, 0, i_91_,
					  class27.anInt368, true, true, i_88_);
	class31.method299 (i_90_, i_84_, class39_sub3_sub2, null, i_97_, 0,
			   anIntArray308[i_86_], i_95_, (byte) -82, i_89_,
			   i_96_);
	if (class27.aBoolean390)
	  class3.method158 (anInt288, i_89_, class27.aBoolean362, i_85_, i_90_,
			    i_86_);
      }
    else if (i_85_ == 1)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (1, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, 1, i_91_,
					  class27.anInt368, true, true, i_88_);
	class31.method299 (i_90_, i_84_, class39_sub3_sub2, null, i_97_, 0,
			   anIntArray297[i_86_], i_95_, (byte) -82, i_89_,
			   i_96_);
	if (class27.aBoolean390)
	  class3.method158 (anInt288, i_89_, class27.aBoolean362, i_85_, i_90_,
			    i_86_);
      }
    else if (i_85_ == 2)
      {
	int i_102_ = i_86_ + 1 & 0x3;
	Class39_Sub3_Sub2 class39_sub3_sub2;
	Class39_Sub3_Sub2 class39_sub3_sub2_103_;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  {
	    class39_sub3_sub2 = class27.method277 (2, 4 + i_86_, i_91_, i_92_,
						   i_93_, i_94_, -1);
	    class39_sub3_sub2_103_
	      = class27.method277 (2, i_102_, i_91_, i_92_, i_93_, i_94_, -1);
	  }
	else
	  {
	    class39_sub3_sub2
	      = new Class39_Sub3_Sub2_Sub6 (i_92_, 4 + i_86_, i_93_, i_94_, 2,
					    i_91_, class27.anInt368, true,
					    true, i_88_);
	    class39_sub3_sub2_103_
	      = new Class39_Sub3_Sub2_Sub6 (i_92_, i_102_, i_93_, i_94_, 2,
					    i_91_, class27.anInt368, true,
					    true, i_88_);
	  }
	class31.method299 (i_90_, i_84_, class39_sub3_sub2,
			   class39_sub3_sub2_103_, i_97_,
			   anIntArray308[i_102_], anIntArray308[i_86_], i_95_,
			   (byte) -82, i_89_, i_96_);
	if (class27.aBoolean390)
	  class3.method158 (anInt288, i_89_, class27.aBoolean362, i_85_, i_90_,
			    i_86_);
      }
    else if (i_85_ == 3)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (3, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, 3, i_91_,
					  class27.anInt368, true, true, i_88_);
	class31.method299 (i_90_, i_84_, class39_sub3_sub2, null, i_97_, 0,
			   anIntArray297[i_86_], i_95_, (byte) -82, i_89_,
			   i_96_);
	if (class27.aBoolean390)
	  class3.method158 (anInt288, i_89_, class27.aBoolean362, i_85_, i_90_,
			    i_86_);
      }
    else if (i_85_ == 9)
      {
	Class39_Sub3_Sub2 class39_sub3_sub2;
	if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	  class39_sub3_sub2
	    = class27.method277 (i_85_, i_86_, i_91_, i_92_, i_93_, i_94_, -1);
	else
	  class39_sub3_sub2
	    = new Class39_Sub3_Sub2_Sub6 (i_92_, i_86_, i_93_, i_94_, i_85_,
					  i_91_, class27.anInt368, true, true,
					  i_88_);
	class31.method301 (i_90_, 1, i_97_, i_84_, 1, 0, i_95_, i_89_,
			   (byte) 2, class39_sub3_sub2, i_96_);
	if (class27.aBoolean390)
	  class3.method159 (i_89_, i_86_, i_90_, (byte) 2, class27.aBoolean362,
			    class27.anInt395, class27.anInt405);
      }
    else
      {
	if (class27.aBoolean374)
	  {
	    if (i_86_ == 1)
	      {
		int i_104_ = i_94_;
		i_94_ = i_93_;
		i_93_ = i_92_;
		i_92_ = i_91_;
		i_91_ = i_104_;
	      }
	    else if (i_86_ == 2)
	      {
		int i_105_ = i_94_;
		i_94_ = i_92_;
		i_92_ = i_105_;
		i_105_ = i_93_;
		i_93_ = i_91_;
		i_91_ = i_105_;
	      }
	    else if (i_86_ == 3)
	      {
		int i_106_ = i_94_;
		i_94_ = i_91_;
		i_91_ = i_92_;
		i_92_ = i_93_;
		i_93_ = i_106_;
	      }
	  }
	if (i_85_ == 4)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2
		= class27.method277 (4, 0, i_91_, i_92_, i_93_, i_94_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_92_, 0, i_93_, i_94_, 4, i_91_,
					      class27.anInt368, true, true,
					      i_88_);
	    class31.method300 (class39_sub3_sub2, -816, i_97_, i_86_ * 512,
			       anIntArray308[i_86_], i_89_, i_84_, 0, i_95_, 0,
			       i_90_, i_96_);
	  }
	else if (i_85_ == 5)
	  {
	    int i_107_ = 16;
	    int i_108_ = class31.method317 (i_84_, i_90_, i_89_);
	    if (i_108_ > 0)
	      i_107_ = Class27.method272 (i_108_ >> 14 & 0x7fff).anInt376;
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2
		= class27.method277 (4, 0, i_91_, i_92_, i_93_, i_94_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_92_, 0, i_93_, i_94_, 4, i_91_,
					      class27.anInt368, true, true,
					      i_88_);
	    class31.method300 (class39_sub3_sub2, -816, i_97_, i_86_ * 512,
			       anIntArray308[i_86_], i_89_, i_84_,
			       anIntArray291[i_86_] * i_107_, i_95_,
			       anIntArray309[i_86_] * i_107_, i_90_, i_96_);
	  }
	else if (i_85_ == 6)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2
		= class27.method277 (4, 0, i_91_, i_92_, i_93_, i_94_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_92_, 0, i_93_, i_94_, 4, i_91_,
					      class27.anInt368, true, true,
					      i_88_);
	    class31.method300 (class39_sub3_sub2, -816, i_97_, i_86_, 256,
			       i_89_, i_84_, 0, i_95_, 0, i_90_, i_96_);
	  }
	else if (i_85_ == 7)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2
		= class27.method277 (4, 0, i_91_, i_92_, i_93_, i_94_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_92_, 0, i_93_, i_94_, 4, i_91_,
					      class27.anInt368, true, true,
					      i_88_);
	    class31.method300 (class39_sub3_sub2, -816, i_97_, i_86_, 512,
			       i_89_, i_84_, 0, i_95_, 0, i_90_, i_96_);
	  }
	else if (i_85_ == 8)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2
		= class27.method277 (4, 0, i_91_, i_92_, i_93_, i_94_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_92_, 0, i_93_, i_94_, 4, i_91_,
					      class27.anInt368, true, true,
					      i_88_);
	    class31.method300 (class39_sub3_sub2, -816, i_97_, i_86_, 768,
			       i_89_, i_84_, 0, i_95_, 0, i_90_, i_96_);
	  }
      }
  }
  
  public void method255 (int i, Class3 class3, Class31 class31, int i_109_,
			 int i_110_, int i_111_, int i_112_, int i_113_,
			 int i_114_)
  {
    if (! aBoolean318
	|| (aByteArrayArrayArray316[0][i_110_][i_112_] & 0x2) != 0
	|| ((aByteArrayArrayArray316[i_113_][i_110_][i_112_] & 0x10) == 0
	    && method253 (i_110_, i_112_, i_113_, 823) == anInt306))
      {
	if (i_113_ < anInt300)
	  anInt300 = i_113_;
	int i_115_ = anIntArrayArrayArray310[i_113_][i_110_][i_112_];
	int i_116_ = anIntArrayArrayArray310[i_113_][i_110_ + 1][i_112_];
	int i_117_ = anIntArrayArrayArray310[i_113_][i_110_ + 1][i_112_ + 1];
	int i_118_ = anIntArrayArrayArray310[i_113_][i_110_][i_112_ + 1];
	int i_119_ = i_115_ + i_116_ + i_117_ + i_118_ >> 2;
	Class27 class27 = Class27.method272 (i_109_);
	if (i_114_ >= 0)
	  {
	    for (int i_120_ = 1; i_120_ > 0; i_120_++)
	      {
		/* empty */
	      }
	  }
	int i_121_ = i_110_ + (i_112_ << 7) + (i_109_ << 14) + 1073741824;
	if (! class27.aBoolean377)
	  i_121_ += -2147483648;
	byte i_122_ = (byte) ((i_111_ << 6) + i);
	if (i == 22)
	  {
	    if (! aBoolean318 || class27.aBoolean377 || class27.aBoolean360)
	      {
		Class39_Sub3_Sub2 class39_sub3_sub2;
		if (class27.anInt368 == -1 && class27.anIntArray367 == null)
		  class39_sub3_sub2
		    = class27.method277 (22, i_111_, i_115_, i_116_, i_117_,
					 i_118_, -1);
		else
		  class39_sub3_sub2
		    = new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_,
						  i_118_, 22, i_115_,
						  class27.anInt368, true, true,
						  i_109_);
		class31.method297 (i_112_, i_122_, i_113_, i_110_,
				   class39_sub3_sub2, i_119_, 3, i_121_);
		if (class27.aBoolean390 && class27.aBoolean377
		    && class3 != null)
		  class3.method160 (i_110_, i_112_, true);
	      }
	  }
	else if (i == 10 || i == 11)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2
		= class27.method277 (10, i_111_, i_115_, i_116_, i_117_,
				     i_118_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_, i_118_,
					      10, i_115_, class27.anInt368,
					      true, true, i_109_);
	    if (class39_sub3_sub2 != null)
	      {
		int i_123_ = 0;
		if (i == 11)
		  i_123_ += 256;
		int i_124_;
		int i_125_;
		if (i_111_ == 1 || i_111_ == 3)
		  {
		    i_124_ = class27.anInt395;
		    i_125_ = class27.anInt405;
		  }
		else
		  {
		    i_124_ = class27.anInt405;
		    i_125_ = class27.anInt395;
		  }
		if (class31.method301 (i_110_, i_124_, i_122_, i_113_, i_125_,
				       i_123_, i_119_, i_112_, (byte) 2,
				       class39_sub3_sub2, i_121_)
		    && class27.aBoolean410)
		  {
		    Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4;
		    if (class39_sub3_sub2 instanceof Class39_Sub3_Sub2_Sub4)
		      class39_sub3_sub2_sub4
			= (Class39_Sub3_Sub2_Sub4) class39_sub3_sub2;
		    else
		      class39_sub3_sub2_sub4
			= class27.method277 (10, i_111_, i_115_, i_116_,
					     i_117_, i_118_, -1);
		    if (class39_sub3_sub2_sub4 != null)
		      {
			for (int i_126_ = 0; i_126_ <= i_124_; i_126_++)
			  {
			    for (int i_127_ = 0; i_127_ <= i_125_; i_127_++)
			      {
				int i_128_
				  = class39_sub3_sub2_sub4.anInt1549 / 4;
				if (i_128_ > 30)
				  i_128_ = 30;
				if (i_128_
				    > (aByteArrayArrayArray298[i_113_]
				       [i_110_ + i_126_][i_112_ + i_127_]))
				  aByteArrayArrayArray298[i_113_]
				    [i_110_ + i_126_][i_112_ + i_127_]
				    = (byte) i_128_;
			      }
			  }
		      }
		  }
	      }
	    if (class27.aBoolean390 && class3 != null)
	      class3.method159 (i_112_, i_111_, i_110_, (byte) 2,
				class27.aBoolean362, class27.anInt395,
				class27.anInt405);
	  }
	else if (i >= 12)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2 = class27.method277 (i, i_111_, i_115_, i_116_,
						     i_117_, i_118_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_, i_118_,
					      i, i_115_, class27.anInt368,
					      true, true, i_109_);
	    class31.method301 (i_110_, 1, i_122_, i_113_, 1, 0, i_119_, i_112_,
			       (byte) 2, class39_sub3_sub2, i_121_);
	    if (i >= 12 && i <= 17 && i != 13 && i_113_ > 0)
	      anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x924;
	    if (class27.aBoolean390 && class3 != null)
	      class3.method159 (i_112_, i_111_, i_110_, (byte) 2,
				class27.aBoolean362, class27.anInt395,
				class27.anInt405);
	  }
	else if (i == 0)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2 = class27.method277 (0, i_111_, i_115_, i_116_,
						     i_117_, i_118_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_, i_118_,
					      0, i_115_, class27.anInt368,
					      true, true, i_109_);
	    class31.method299 (i_110_, i_113_, class39_sub3_sub2, null, i_122_,
			       0, anIntArray308[i_111_], i_119_, (byte) -82,
			       i_112_, i_121_);
	    if (i_111_ == 0)
	      {
		if (class27.aBoolean410)
		  {
		    aByteArrayArrayArray298[i_113_][i_110_][i_112_]
		      = (byte) 50;
		    aByteArrayArrayArray298[i_113_][i_110_][i_112_ + 1]
		      = (byte) 50;
		  }
		if (class27.aBoolean361)
		  anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x249;
	      }
	    else if (i_111_ == 1)
	      {
		if (class27.aBoolean410)
		  {
		    aByteArrayArrayArray298[i_113_][i_110_][i_112_ + 1]
		      = (byte) 50;
		    aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_ + 1]
		      = (byte) 50;
		  }
		if (class27.aBoolean361)
		  anIntArrayArrayArray290[i_113_][i_110_][i_112_ + 1] |= 0x492;
	      }
	    else if (i_111_ == 2)
	      {
		if (class27.aBoolean410)
		  {
		    aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_]
		      = (byte) 50;
		    aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_ + 1]
		      = (byte) 50;
		  }
		if (class27.aBoolean361)
		  anIntArrayArrayArray290[i_113_][i_110_ + 1][i_112_] |= 0x249;
	      }
	    else if (i_111_ == 3)
	      {
		if (class27.aBoolean410)
		  {
		    aByteArrayArrayArray298[i_113_][i_110_][i_112_]
		      = (byte) 50;
		    aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_]
		      = (byte) 50;
		  }
		if (class27.aBoolean361)
		  anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x492;
	      }
	    if (class27.aBoolean390 && class3 != null)
	      class3.method158 (anInt288, i_112_, class27.aBoolean362, i,
				i_110_, i_111_);
	    if (class27.anInt376 != 16)
	      class31.method307 (i_113_, i_110_, true, class27.anInt376,
				 i_112_);
	  }
	else if (i == 1)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2 = class27.method277 (1, i_111_, i_115_, i_116_,
						     i_117_, i_118_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_, i_118_,
					      1, i_115_, class27.anInt368,
					      true, true, i_109_);
	    class31.method299 (i_110_, i_113_, class39_sub3_sub2, null, i_122_,
			       0, anIntArray297[i_111_], i_119_, (byte) -82,
			       i_112_, i_121_);
	    if (class27.aBoolean410)
	      {
		if (i_111_ == 0)
		  aByteArrayArrayArray298[i_113_][i_110_][i_112_ + 1]
		    = (byte) 50;
		else if (i_111_ == 1)
		  aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_ + 1]
		    = (byte) 50;
		else if (i_111_ == 2)
		  aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_]
		    = (byte) 50;
		else if (i_111_ == 3)
		  aByteArrayArrayArray298[i_113_][i_110_][i_112_] = (byte) 50;
	      }
	    if (class27.aBoolean390 && class3 != null)
	      class3.method158 (anInt288, i_112_, class27.aBoolean362, i,
				i_110_, i_111_);
	  }
	else if (i == 2)
	  {
	    int i_129_ = i_111_ + 1 & 0x3;
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    Class39_Sub3_Sub2 class39_sub3_sub2_130_;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      {
		class39_sub3_sub2
		  = class27.method277 (2, 4 + i_111_, i_115_, i_116_, i_117_,
				       i_118_, -1);
		class39_sub3_sub2_130_
		  = class27.method277 (2, i_129_, i_115_, i_116_, i_117_,
				       i_118_, -1);
	      }
	    else
	      {
		class39_sub3_sub2
		  = new Class39_Sub3_Sub2_Sub6 (i_116_, 4 + i_111_, i_117_,
						i_118_, 2, i_115_,
						class27.anInt368, true, true,
						i_109_);
		class39_sub3_sub2_130_
		  = new Class39_Sub3_Sub2_Sub6 (i_116_, i_129_, i_117_, i_118_,
						2, i_115_, class27.anInt368,
						true, true, i_109_);
	      }
	    class31.method299 (i_110_, i_113_, class39_sub3_sub2,
			       class39_sub3_sub2_130_, i_122_,
			       anIntArray308[i_129_], anIntArray308[i_111_],
			       i_119_, (byte) -82, i_112_, i_121_);
	    if (class27.aBoolean361)
	      {
		if (i_111_ == 0)
		  {
		    anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x249;
		    anIntArrayArrayArray290[i_113_][i_110_][i_112_ + 1]
		      |= 0x492;
		  }
		else if (i_111_ == 1)
		  {
		    anIntArrayArrayArray290[i_113_][i_110_][i_112_ + 1]
		      |= 0x492;
		    anIntArrayArrayArray290[i_113_][i_110_ + 1][i_112_]
		      |= 0x249;
		  }
		else if (i_111_ == 2)
		  {
		    anIntArrayArrayArray290[i_113_][i_110_ + 1][i_112_]
		      |= 0x249;
		    anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x492;
		  }
		else if (i_111_ == 3)
		  {
		    anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x492;
		    anIntArrayArrayArray290[i_113_][i_110_][i_112_] |= 0x249;
		  }
	      }
	    if (class27.aBoolean390 && class3 != null)
	      class3.method158 (anInt288, i_112_, class27.aBoolean362, i,
				i_110_, i_111_);
	    if (class27.anInt376 != 16)
	      class31.method307 (i_113_, i_110_, true, class27.anInt376,
				 i_112_);
	  }
	else if (i == 3)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2 = class27.method277 (3, i_111_, i_115_, i_116_,
						     i_117_, i_118_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_, i_118_,
					      3, i_115_, class27.anInt368,
					      true, true, i_109_);
	    class31.method299 (i_110_, i_113_, class39_sub3_sub2, null, i_122_,
			       0, anIntArray297[i_111_], i_119_, (byte) -82,
			       i_112_, i_121_);
	    if (class27.aBoolean410)
	      {
		if (i_111_ == 0)
		  aByteArrayArrayArray298[i_113_][i_110_][i_112_ + 1]
		    = (byte) 50;
		else if (i_111_ == 1)
		  aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_ + 1]
		    = (byte) 50;
		else if (i_111_ == 2)
		  aByteArrayArrayArray298[i_113_][i_110_ + 1][i_112_]
		    = (byte) 50;
		else if (i_111_ == 3)
		  aByteArrayArrayArray298[i_113_][i_110_][i_112_] = (byte) 50;
	      }
	    if (class27.aBoolean390 && class3 != null)
	      class3.method158 (anInt288, i_112_, class27.aBoolean362, i,
				i_110_, i_111_);
	  }
	else if (i == 9)
	  {
	    Class39_Sub3_Sub2 class39_sub3_sub2;
	    if (class27.anInt368 == -1 && class27.anIntArray367 == null)
	      class39_sub3_sub2 = class27.method277 (i, i_111_, i_115_, i_116_,
						     i_117_, i_118_, -1);
	    else
	      class39_sub3_sub2
		= new Class39_Sub3_Sub2_Sub6 (i_116_, i_111_, i_117_, i_118_,
					      i, i_115_, class27.anInt368,
					      true, true, i_109_);
	    class31.method301 (i_110_, 1, i_122_, i_113_, 1, 0, i_119_, i_112_,
			       (byte) 2, class39_sub3_sub2, i_121_);
	    if (class27.aBoolean390 && class3 != null)
	      class3.method159 (i_112_, i_111_, i_110_, (byte) 2,
				class27.aBoolean362, class27.anInt395,
				class27.anInt405);
	  }
	else
	  {
	    if (class27.aBoolean374)
	      {
		if (i_111_ == 1)
		  {
		    int i_131_ = i_118_;
		    i_118_ = i_117_;
		    i_117_ = i_116_;
		    i_116_ = i_115_;
		    i_115_ = i_131_;
		  }
		else if (i_111_ == 2)
		  {
		    int i_132_ = i_118_;
		    i_118_ = i_116_;
		    i_116_ = i_132_;
		    i_132_ = i_117_;
		    i_117_ = i_115_;
		    i_115_ = i_132_;
		  }
		else if (i_111_ == 3)
		  {
		    int i_133_ = i_118_;
		    i_118_ = i_115_;
		    i_115_ = i_116_;
		    i_116_ = i_117_;
		    i_117_ = i_133_;
		  }
	      }
	    if (i == 4)
	      {
		Class39_Sub3_Sub2 class39_sub3_sub2;
		if (class27.anInt368 == -1 && class27.anIntArray367 == null)
		  class39_sub3_sub2 = class27.method277 (4, 0, i_115_, i_116_,
							 i_117_, i_118_, -1);
		else
		  class39_sub3_sub2
		    = new Class39_Sub3_Sub2_Sub6 (i_116_, 0, i_117_, i_118_, 4,
						  i_115_, class27.anInt368,
						  true, true, i_109_);
		class31.method300 (class39_sub3_sub2, -816, i_122_,
				   i_111_ * 512, anIntArray308[i_111_], i_112_,
				   i_113_, 0, i_119_, 0, i_110_, i_121_);
	      }
	    else if (i == 5)
	      {
		int i_134_ = 16;
		int i_135_ = class31.method317 (i_113_, i_110_, i_112_);
		if (i_135_ > 0)
		  i_134_ = Class27.method272 (i_135_ >> 14 & 0x7fff).anInt376;
		Class39_Sub3_Sub2 class39_sub3_sub2;
		if (class27.anInt368 == -1 && class27.anIntArray367 == null)
		  class39_sub3_sub2 = class27.method277 (4, 0, i_115_, i_116_,
							 i_117_, i_118_, -1);
		else
		  class39_sub3_sub2
		    = new Class39_Sub3_Sub2_Sub6 (i_116_, 0, i_117_, i_118_, 4,
						  i_115_, class27.anInt368,
						  true, true, i_109_);
		class31.method300 (class39_sub3_sub2, -816, i_122_,
				   i_111_ * 512, anIntArray308[i_111_], i_112_,
				   i_113_, anIntArray291[i_111_] * i_134_,
				   i_119_, anIntArray309[i_111_] * i_134_,
				   i_110_, i_121_);
	      }
	    else if (i == 6)
	      {
		Class39_Sub3_Sub2 class39_sub3_sub2;
		if (class27.anInt368 == -1 && class27.anIntArray367 == null)
		  class39_sub3_sub2 = class27.method277 (4, 0, i_115_, i_116_,
							 i_117_, i_118_, -1);
		else
		  class39_sub3_sub2
		    = new Class39_Sub3_Sub2_Sub6 (i_116_, 0, i_117_, i_118_, 4,
						  i_115_, class27.anInt368,
						  true, true, i_109_);
		class31.method300 (class39_sub3_sub2, -816, i_122_, i_111_,
				   256, i_112_, i_113_, 0, i_119_, 0, i_110_,
				   i_121_);
	      }
	    else if (i == 7)
	      {
		Class39_Sub3_Sub2 class39_sub3_sub2;
		if (class27.anInt368 == -1 && class27.anIntArray367 == null)
		  class39_sub3_sub2 = class27.method277 (4, 0, i_115_, i_116_,
							 i_117_, i_118_, -1);
		else
		  class39_sub3_sub2
		    = new Class39_Sub3_Sub2_Sub6 (i_116_, 0, i_117_, i_118_, 4,
						  i_115_, class27.anInt368,
						  true, true, i_109_);
		class31.method300 (class39_sub3_sub2, -816, i_122_, i_111_,
				   512, i_112_, i_113_, 0, i_119_, 0, i_110_,
				   i_121_);
	      }
	    else if (i == 8)
	      {
		Class39_Sub3_Sub2 class39_sub3_sub2;
		if (class27.anInt368 == -1 && class27.anIntArray367 == null)
		  class39_sub3_sub2 = class27.method277 (4, 0, i_115_, i_116_,
							 i_117_, i_118_, -1);
		else
		  class39_sub3_sub2
		    = new Class39_Sub3_Sub2_Sub6 (i_116_, 0, i_117_, i_118_, 4,
						  i_115_, class27.anInt368,
						  true, true, i_109_);
		class31.method300 (class39_sub3_sub2, -816, i_122_, i_111_,
				   768, i_112_, i_113_, 0, i_119_, 0, i_110_,
				   i_121_);
	      }
	  }
      }
  }
  
  public void method256 (int i, int i_136_, int i_137_, byte i_138_) {
    if (i_138_ == 7)
      {
      }
    else
      return;
    for (int i_139_ = 0; i_139_ < 8; i_139_++)
      {
	for (int i_140_ = 0; i_140_ < 8; i_140_++)
	  anIntArrayArrayArray310[i_137_][i + i_139_][i_136_ + i_140_] = 0;
      }
    if (i > 0)
      {
	for (int i_141_ = 1; i_141_ < 8; i_141_++)
	  anIntArrayArrayArray310[i_137_][i][i_136_ + i_141_]
	    = anIntArrayArrayArray310[i_137_][i - 1][i_136_ + i_141_];
      }
    if (i_136_ > 0)
      {
	for (int i_142_ = 1; i_142_ < 8; i_142_++)
	  anIntArrayArrayArray310[i_137_][i + i_142_][i_136_]
	    = anIntArrayArrayArray310[i_137_][i + i_142_][i_136_ - 1];
      }
    if (i > 0 && anIntArrayArrayArray310[i_137_][i - 1][i_136_] != 0)
      anIntArrayArrayArray310[i_137_][i][i_136_]
	= anIntArrayArrayArray310[i_137_][i - 1][i_136_];
    else if (i_136_ > 0 && anIntArrayArrayArray310[i_137_][i][i_136_ - 1] != 0)
      anIntArrayArrayArray310[i_137_][i][i_136_]
	= anIntArrayArrayArray310[i_137_][i][i_136_ - 1];
    else if (i > 0 && i_136_ > 0
	     && anIntArrayArrayArray310[i_137_][i - 1][i_136_ - 1] != 0)
      anIntArrayArrayArray310[i_137_][i][i_136_]
	= anIntArrayArrayArray310[i_137_][i - 1][i_136_ - 1];
  }
  
  public void method257 (int i, int i_143_, int i_144_, byte i_145_,
			 int i_146_)
  {
    for (int i_147_ = i_143_; i_147_ <= i_143_ + i; i_147_++)
      {
	for (int i_148_ = i_146_; i_148_ <= i_146_ + i_144_; i_148_++)
	  {
	    if (i_148_ >= 0 && i_148_ < anInt301 && i_147_ >= 0
		&& i_147_ < anInt302)
	      {
		aByteArrayArrayArray298[0][i_148_][i_147_] = (byte) 127;
		if (i_148_ == i_146_ && i_148_ > 0)
		  anIntArrayArrayArray310[0][i_148_][i_147_]
		    = anIntArrayArrayArray310[0][i_148_ - 1][i_147_];
		if (i_148_ == i_146_ + i_144_ && i_148_ < anInt301 - 1)
		  anIntArrayArrayArray310[0][i_148_][i_147_]
		    = anIntArrayArrayArray310[0][i_148_ + 1][i_147_];
		if (i_147_ == i_143_ && i_147_ > 0)
		  anIntArrayArrayArray310[0][i_148_][i_147_]
		    = anIntArrayArrayArray310[0][i_148_][i_147_ - 1];
		if (i_147_ == i_143_ + i && i_147_ < anInt302 - 1)
		  anIntArrayArrayArray310[0][i_148_][i_147_]
		    = anIntArrayArrayArray310[0][i_148_][i_147_ + 1];
	      }
	  }
      }
    if (i_145_ == 1)
      {
      }
  }
  
  public static int method258 (int i, int i_149_, int i_150_, int i_151_)
  {
    int i_152_
      = (65536 - Class39_Sub3_Sub4_Sub1.anIntArray1679[i_150_ * 1024 / i_151_]
	 >> 1);
    return (i * (65536 - i_152_) >> 16) + (i_149_ * i_152_ >> 16);
  }
  
  public static int method259 (int i, int i_153_)
  {
    int i_154_
      = (method250 (i - 1, i_153_ - 1) + method250 (i + 1, i_153_ - 1)
	 + method250 (i - 1, i_153_ + 1) + method250 (i + 1, i_153_ + 1));
    int i_155_ = (method250 (i - 1, i_153_) + method250 (i + 1, i_153_)
		  + method250 (i, i_153_ - 1) + method250 (i, i_153_ + 1));
    int i_156_ = method250 (i, i_153_);
    return i_154_ / 16 + i_155_ / 8 + i_156_ / 4;
  }
  
  public void method260 (Class3[] class3s, Class31 class31, int i)
  {
    for (int i_157_ = 0; i_157_ < 4; i_157_++)
      {
	for (int i_158_ = 0; i_158_ < 104; i_158_++)
	  {
	    for (int i_159_ = 0; i_159_ < 104; i_159_++)
	      {
		if ((aByteArrayArrayArray316[i_157_][i_158_][i_159_] & 0x1)
		    == 1)
		  {
		    int i_160_ = i_157_;
		    if ((aByteArrayArrayArray316[1][i_158_][i_159_] & 0x2)
			== 2)
		      i_160_--;
		    if (i_160_ >= 0)
		      class3s[i_160_].method160 (i_158_, i_159_, true);
		  }
	      }
	  }
      }
    anInt315 += (int) (Math.random () * 5.0) - 2;
    if (anInt315 < -8)
      anInt315 = -8;
    if (anInt315 > 8)
      anInt315 = 8;
    anInt313 += (int) (Math.random () * 5.0) - 2;
    if (anInt313 < -16)
      anInt313 = -16;
    if (anInt313 > 16)
      anInt313 = 16;
    for (int i_161_ = 0; i_161_ < 4; i_161_++)
      {
	byte[][] is = aByteArrayArrayArray298[i_161_];
	int i_162_ = 96;
	int i_163_ = 768;
	int i_164_ = -50;
	int i_165_ = -10;
	int i_166_ = -50;
	int i_167_
	  = (int) Math.sqrt ((double) (i_164_ * i_164_ + i_165_ * i_165_
				       + i_166_ * i_166_));
	int i_168_ = i_163_ * i_167_ >> 8;
	for (int i_169_ = 1; i_169_ < anInt302 - 1; i_169_++)
	  {
	    for (int i_170_ = 1; i_170_ < anInt301 - 1; i_170_++)
	      {
		int i_171_
		  = (anIntArrayArrayArray310[i_161_][i_170_ + 1][i_169_]
		     - anIntArrayArrayArray310[i_161_][i_170_ - 1][i_169_]);
		int i_172_
		  = (anIntArrayArrayArray310[i_161_][i_170_][i_169_ + 1]
		     - anIntArrayArrayArray310[i_161_][i_170_][i_169_ - 1]);
		int i_173_ = (int) Math.sqrt ((double) (i_171_ * i_171_ + 65536
							+ i_172_ * i_172_));
		int i_174_ = (i_171_ << 8) / i_173_;
		int i_175_ = 65536 / i_173_;
		int i_176_ = (i_172_ << 8) / i_173_;
		int i_177_ = i_162_ + (i_164_ * i_174_ + i_165_ * i_175_
				       + i_166_ * i_176_) / i_168_;
		int i_178_ = ((is[i_170_ - 1][i_169_] >> 2)
			      + (is[i_170_ + 1][i_169_] >> 3)
			      + (is[i_170_][i_169_ - 1] >> 2)
			      + (is[i_170_][i_169_ + 1] >> 3)
			      + (is[i_170_][i_169_] >> 1));
		anIntArrayArray307[i_170_][i_169_] = i_177_ - i_178_;
	      }
	  }
	for (int i_179_ = 0; i_179_ < anInt302; i_179_++)
	  {
	    anIntArray292[i_179_] = 0;
	    anIntArray293[i_179_] = 0;
	    anIntArray294[i_179_] = 0;
	    anIntArray295[i_179_] = 0;
	    anIntArray296[i_179_] = 0;
	  }
	for (int i_180_ = -5; i_180_ < anInt301 + 5; i_180_++)
	  {
	    for (int i_181_ = 0; i_181_ < anInt302; i_181_++)
	      {
		int i_182_ = i_180_ + 5;
		if (i_182_ >= 0 && i_182_ < anInt301)
		  {
		    int i_183_
		      = aByteArrayArrayArray303[i_161_][i_182_][i_181_] & 0xff;
		    if (i_183_ > 0)
		      {
			Class45 class45 = Class45.aClass45Array754[i_183_ - 1];
			anIntArray292[i_181_] += class45.anInt763;
			anIntArray293[i_181_] += class45.anInt761;
			anIntArray294[i_181_] += class45.anInt762;
			anIntArray295[i_181_] += class45.anInt764;
			anIntArray296[i_181_]++;
		      }
		  }
		int i_184_ = i_180_ - 5;
		if (i_184_ >= 0 && i_184_ < anInt301)
		  {
		    int i_185_
		      = aByteArrayArrayArray303[i_161_][i_184_][i_181_] & 0xff;
		    if (i_185_ > 0)
		      {
			Class45 class45 = Class45.aClass45Array754[i_185_ - 1];
			anIntArray292[i_181_] -= class45.anInt763;
			anIntArray293[i_181_] -= class45.anInt761;
			anIntArray294[i_181_] -= class45.anInt762;
			anIntArray295[i_181_] -= class45.anInt764;
			anIntArray296[i_181_]--;
		      }
		  }
	      }
	    if (i_180_ >= 1 && i_180_ < anInt301 - 1)
	      {
		int i_186_ = 0;
		int i_187_ = 0;
		int i_188_ = 0;
		int i_189_ = 0;
		int i_190_ = 0;
		for (int i_191_ = -5; i_191_ < anInt302 + 5; i_191_++)
		  {
		    int i_192_ = i_191_ + 5;
		    if (i_192_ >= 0 && i_192_ < anInt302)
		      {
			i_186_ += anIntArray292[i_192_];
			i_187_ += anIntArray293[i_192_];
			i_188_ += anIntArray294[i_192_];
			i_189_ += anIntArray295[i_192_];
			i_190_ += anIntArray296[i_192_];
		      }
		    int i_193_ = i_191_ - 5;
		    if (i_193_ >= 0 && i_193_ < anInt302)
		      {
			i_186_ -= anIntArray292[i_193_];
			i_187_ -= anIntArray293[i_193_];
			i_188_ -= anIntArray294[i_193_];
			i_189_ -= anIntArray295[i_193_];
			i_190_ -= anIntArray296[i_193_];
		      }
		    if (i_191_ >= 1 && i_191_ < anInt302 - 1
			&& (! aBoolean318
			    || (aByteArrayArrayArray316[0][i_180_][i_191_]
				& 0x2) != 0
			    || (((aByteArrayArrayArray316[i_161_][i_180_]
				  [i_191_])
				 & 0x10) == 0
				&& (method253 (i_180_, i_191_, i_161_, 823)
				    == anInt306))))
		      {
			if (i_161_ < anInt300)
			  anInt300 = i_161_;
			int i_194_
			  = (aByteArrayArrayArray303[i_161_][i_180_][i_191_]
			     & 0xff);
			int i_195_
			  = (aByteArrayArrayArray289[i_161_][i_180_][i_191_]
			     & 0xff);
			if (i_194_ > 0 || i_195_ > 0)
			  {
			    int i_196_ = (anIntArrayArrayArray310[i_161_]
					  [i_180_][i_191_]);
			    int i_197_ = (anIntArrayArrayArray310[i_161_]
					  [i_180_ + 1][i_191_]);
			    int i_198_ = (anIntArrayArrayArray310[i_161_]
					  [i_180_ + 1][i_191_ + 1]);
			    int i_199_ = (anIntArrayArrayArray310[i_161_]
					  [i_180_][i_191_ + 1]);
			    int i_200_ = anIntArrayArray307[i_180_][i_191_];
			    int i_201_
			      = anIntArrayArray307[i_180_ + 1][i_191_];
			    int i_202_
			      = anIntArrayArray307[i_180_ + 1][i_191_ + 1];
			    int i_203_
			      = anIntArrayArray307[i_180_][i_191_ + 1];
			    int i_204_ = -1;
			    int i_205_ = -1;
			    if (i_194_ > 0)
			      {
				int i_206_ = i_186_ * 256 / i_189_;
				int i_207_ = i_187_ / i_190_;
				int i_208_ = i_188_ / i_190_;
				i_204_ = method247 (i_206_, i_207_, i_208_);
				i_206_ = i_206_ + anInt315 & 0xff;
				i_208_ += anInt313;
				if (i_208_ < 0)
				  i_208_ = 0;
				else if (i_208_ > 255)
				  i_208_ = 255;
				i_205_ = method247 (i_206_, i_207_, i_208_);
			      }
			    if (i_161_ > 0)
			      {
				boolean bool = true;
				if (i_194_ == 0
				    && (aByteArrayArrayArray299[i_161_][i_180_]
					[i_191_]) != 0)
				  bool = false;
				if (i_195_ > 0 && ! (Class45.aClass45Array754
						     [i_195_ - 1].aBoolean759))
				  bool = false;
				if (bool && i_196_ == i_197_
				    && i_196_ == i_198_ && i_196_ == i_199_)
				  anIntArrayArrayArray290[i_161_][i_180_]
				    [i_191_]
				    |= 0x924;
			      }
			    int i_209_ = 0;
			    if (i_204_ != -1)
			      i_209_ = (Class39_Sub3_Sub4_Sub1.anIntArray1690
					[method261 (i_205_, 96)]);
			    if (i_195_ == 0)
			      class31.method296 (i_161_, i_180_, i_191_, 0, 0,
						 -1, i_196_, i_197_, i_198_,
						 i_199_,
						 method261 (i_204_, i_200_),
						 method261 (i_204_, i_201_),
						 method261 (i_204_, i_202_),
						 method261 (i_204_, i_203_), 0,
						 0, 0, 0, i_209_, 0);
			    else
			      {
				int i_210_ = ((aByteArrayArrayArray299[i_161_]
					       [i_180_][i_191_])
					      + 1);
				byte i_211_ = (aByteArrayArrayArray311[i_161_]
					       [i_180_][i_191_]);
				Class45 class45
				  = Class45.aClass45Array754[i_195_ - 1];
				int i_212_ = class45.anInt757;
				int i_213_;
				int i_214_;
				if (i_212_ >= 0)
				  {
				    i_214_ = Class39_Sub3_Sub4_Sub1
					       .method491 (-43936, i_212_);
				    i_213_ = -1;
				  }
				else if (class45.anInt756 == 16711935)
				  {
				    i_213_ = -2;
				    i_212_ = -1;
				    i_214_
				      = (Class39_Sub3_Sub4_Sub1.anIntArray1690
					 [method265 (class45.anInt765, 96)]);
				  }
				else
				  {
				    i_213_ = method247 (class45.anInt760,
							class45.anInt761,
							class45.anInt762);
				    i_214_
				      = (Class39_Sub3_Sub4_Sub1.anIntArray1690
					 [method265 (class45.anInt765, 96)]);
				  }
				class31.method296 (i_161_, i_180_, i_191_,
						   i_210_, i_211_, i_212_,
						   i_196_, i_197_, i_198_,
						   i_199_,
						   method261 (i_204_, i_200_),
						   method261 (i_204_, i_201_),
						   method261 (i_204_, i_202_),
						   method261 (i_204_, i_203_),
						   method265 (i_213_, i_200_),
						   method265 (i_213_, i_201_),
						   method265 (i_213_, i_202_),
						   method265 (i_213_, i_203_),
						   i_209_, i_214_);
			      }
			  }
		      }
		  }
	      }
	  }
	for (int i_215_ = 1; i_215_ < anInt302 - 1; i_215_++)
	  {
	    for (int i_216_ = 1; i_216_ < anInt301 - 1; i_216_++)
	      class31.method295 (i_161_, i_216_, i_215_,
				 method253 (i_216_, i_215_, i_161_, 823));
	  }
      }
    if (i != -2206)
      anInt288 = -463;
    class31.method322 (-50, 9, -10, -50);
    for (int i_217_ = 0; i_217_ < anInt301; i_217_++)
      {
	for (int i_218_ = 0; i_218_ < anInt302; i_218_++)
	  {
	    if ((aByteArrayArrayArray316[1][i_217_][i_218_] & 0x2) == 2)
	      class31.method293 (i_218_, (byte) 9, i_217_);
	  }
      }
    int i_219_ = 1;
    int i_220_ = 2;
    int i_221_ = 4;
    for (int i_222_ = 0; i_222_ < 4; i_222_++)
      {
	if (i_222_ > 0)
	  {
	    i_219_ <<= 3;
	    i_220_ <<= 3;
	    i_221_ <<= 3;
	  }
	for (int i_223_ = 0; i_223_ <= i_222_; i_223_++)
	  {
	    for (int i_224_ = 0; i_224_ <= anInt302; i_224_++)
	      {
		for (int i_225_ = 0; i_225_ <= anInt301; i_225_++)
		  {
		    if ((anIntArrayArrayArray290[i_223_][i_225_][i_224_]
			 & i_219_)
			!= 0)
		      {
			int i_226_ = i_224_;
			int i_227_ = i_224_;
			int i_228_ = i_223_;
			int i_229_ = i_223_;
			for (/**/; i_226_ > 0; i_226_--)
			  {
			    if (((anIntArrayArrayArray290[i_223_][i_225_]
				  [i_226_ - 1])
				 & i_219_)
				== 0)
			      break;
			  }
			for (/**/; i_227_ < anInt302; i_227_++)
			  {
			    if (((anIntArrayArrayArray290[i_223_][i_225_]
				  [i_227_ + 1])
				 & i_219_)
				== 0)
			      break;
			  }
		      while_0_:
			for (/**/; i_228_ > 0; i_228_--)
			  {
			    for (int i_230_ = i_226_; i_230_ <= i_227_;
				 i_230_++)
			      {
				if (((anIntArrayArrayArray290[i_228_ - 1]
				      [i_225_][i_230_])
				     & i_219_)
				    == 0)
				  break while_0_;
			      }
			  }
		      while_1_:
			for (/**/; i_229_ < i_222_; i_229_++)
			  {
			    for (int i_231_ = i_226_; i_231_ <= i_227_;
				 i_231_++)
			      {
				if (((anIntArrayArrayArray290[i_229_ + 1]
				      [i_225_][i_231_])
				     & i_219_)
				    == 0)
				  break while_1_;
			      }
			  }
			int i_232_
			  = (i_229_ + 1 - i_228_) * (i_227_ - i_226_ + 1);
			if (i_232_ >= 8)
			  {
			    int i_233_ = 240;
			    int i_234_ = ((anIntArrayArrayArray310[i_229_]
					   [i_225_][i_226_])
					  - i_233_);
			    int i_235_ = (anIntArrayArrayArray310[i_228_]
					  [i_225_][i_226_]);
			    Class31.method294 (i_225_ * 128,
					       i_227_ * 128 + 128, i_235_,
					       i_222_, i_234_, 1, i_225_ * 128,
					       i_226_ * 128, 3);
			    for (int i_236_ = i_228_; i_236_ <= i_229_;
				 i_236_++)
			      {
				for (int i_237_ = i_226_; i_237_ <= i_227_;
				     i_237_++)
				  anIntArrayArrayArray290[i_236_][i_225_]
				    [i_237_]
				    &= i_219_ ^ 0xffffffff;
			      }
			  }
		      }
		    if ((anIntArrayArrayArray290[i_223_][i_225_][i_224_]
			 & i_220_)
			!= 0)
		      {
			int i_238_ = i_225_;
			int i_239_ = i_225_;
			int i_240_ = i_223_;
			int i_241_ = i_223_;
			for (/**/; i_238_ > 0; i_238_--)
			  {
			    if (((anIntArrayArrayArray290[i_223_][i_238_ - 1]
				  [i_224_])
				 & i_220_)
				== 0)
			      break;
			  }
			for (/**/; i_239_ < anInt301; i_239_++)
			  {
			    if (((anIntArrayArrayArray290[i_223_][i_239_ + 1]
				  [i_224_])
				 & i_220_)
				== 0)
			      break;
			  }
		      while_2_:
			for (/**/; i_240_ > 0; i_240_--)
			  {
			    for (int i_242_ = i_238_; i_242_ <= i_239_;
				 i_242_++)
			      {
				if (((anIntArrayArrayArray290[i_240_ - 1]
				      [i_242_][i_224_])
				     & i_220_)
				    == 0)
				  break while_2_;
			      }
			  }
		      while_3_:
			for (/**/; i_241_ < i_222_; i_241_++)
			  {
			    for (int i_243_ = i_238_; i_243_ <= i_239_;
				 i_243_++)
			      {
				if (((anIntArrayArrayArray290[i_241_ + 1]
				      [i_243_][i_224_])
				     & i_220_)
				    == 0)
				  break while_3_;
			      }
			  }
			int i_244_
			  = (i_241_ + 1 - i_240_) * (i_239_ - i_238_ + 1);
			if (i_244_ >= 8)
			  {
			    int i_245_ = 240;
			    int i_246_ = ((anIntArrayArrayArray310[i_241_]
					   [i_238_][i_224_])
					  - i_245_);
			    int i_247_ = (anIntArrayArrayArray310[i_240_]
					  [i_238_][i_224_]);
			    Class31.method294 (i_238_ * 128, i_224_ * 128,
					       i_247_, i_222_, i_246_, 2,
					       i_239_ * 128 + 128,
					       i_224_ * 128, 3);
			    for (int i_248_ = i_240_; i_248_ <= i_241_;
				 i_248_++)
			      {
				for (int i_249_ = i_238_; i_249_ <= i_239_;
				     i_249_++)
				  anIntArrayArrayArray290[i_248_][i_249_]
				    [i_224_]
				    &= i_220_ ^ 0xffffffff;
			      }
			  }
		      }
		    if ((anIntArrayArrayArray290[i_223_][i_225_][i_224_]
			 & i_221_)
			!= 0)
		      {
			int i_250_ = i_225_;
			int i_251_ = i_225_;
			int i_252_ = i_224_;
			int i_253_ = i_224_;
			for (/**/; i_252_ > 0; i_252_--)
			  {
			    if (((anIntArrayArrayArray290[i_223_][i_225_]
				  [i_252_ - 1])
				 & i_221_)
				== 0)
			      break;
			  }
			for (/**/; i_253_ < anInt302; i_253_++)
			  {
			    if (((anIntArrayArrayArray290[i_223_][i_225_]
				  [i_253_ + 1])
				 & i_221_)
				== 0)
			      break;
			  }
		      while_4_:
			for (/**/; i_250_ > 0; i_250_--)
			  {
			    for (int i_254_ = i_252_; i_254_ <= i_253_;
				 i_254_++)
			      {
				if (((anIntArrayArrayArray290[i_223_]
				      [i_250_ - 1][i_254_])
				     & i_221_)
				    == 0)
				  break while_4_;
			      }
			  }
		      while_5_:
			for (/**/; i_251_ < anInt301; i_251_++)
			  {
			    for (int i_255_ = i_252_; i_255_ <= i_253_;
				 i_255_++)
			      {
				if (((anIntArrayArrayArray290[i_223_]
				      [i_251_ + 1][i_255_])
				     & i_221_)
				    == 0)
				  break while_5_;
			      }
			  }
			if ((i_251_ - i_250_ + 1) * (i_253_ - i_252_ + 1) >= 4)
			  {
			    int i_256_ = (anIntArrayArrayArray310[i_223_]
					  [i_250_][i_252_]);
			    Class31.method294 (i_250_ * 128,
					       i_253_ * 128 + 128, i_256_,
					       i_222_, i_256_, 4,
					       i_251_ * 128 + 128,
					       i_252_ * 128, 3);
			    for (int i_257_ = i_250_; i_257_ <= i_251_;
				 i_257_++)
			      {
				for (int i_258_ = i_252_; i_258_ <= i_253_;
				     i_258_++)
				  anIntArrayArrayArray290[i_223_][i_257_]
				    [i_258_]
				    &= i_221_ ^ 0xffffffff;
			      }
			  }
		      }
		  }
	      }
	  }
      }
  }
  
  public static int method261 (int i, int i_259_)
  {
    if (i == -1)
      return 12345678;
    i_259_ = i_259_ * (i & 0x7f) / 128;
    if (i_259_ < 2)
      i_259_ = 2;
    else if (i_259_ > 126)
      i_259_ = 126;
    return (i & 0xff80) + i_259_;
  }
  
  public void method262 (int i, int i_260_, int i_261_, int i_262_,
			 Class3[] class3s, byte[] is, int i_263_)
  {
    for (int i_264_ = 0; i_264_ < 4; i_264_++)
      {
	for (int i_265_ = 0; i_265_ < 64; i_265_++)
	  {
	    for (int i_266_ = 0; i_266_ < 64; i_266_++)
	      {
		if (i + i_265_ > 0 && i + i_265_ < 103 && i_262_ + i_266_ > 0
		    && i_262_ + i_266_ < 103)
		  class3s[i_264_].anIntArrayArray59[i + i_265_][(i_262_
								 + i_266_)]
		    &= ~0x1000000;
	      }
	  }
      }
    if (i_260_ != 6)
      anInt312 = 99;
    Buffer class39_sub3_sub3
      = new Buffer(is);
    for (int i_267_ = 0; i_267_ < 4; i_267_++)
      {
	for (int i_268_ = 0; i_268_ < 64; i_268_++)
	  {
	    for (int i_269_ = 0; i_269_ < 64; i_269_++)
	      method249 (i_267_, true, i_263_, i_269_ + i_262_, i_261_,
			 i_268_ + i, 0, class39_sub3_sub3);
	  }
      }
  }
  
  public static int method263 (int i, int i_270_)
  {
    int i_271_ = (method244 (i + 45365, i_270_ + 91923, 4) - 128
		  + (method244 (i + 10294, i_270_ + 37821, 2) - 128 >> 1)
		  + (method244 (i, i_270_, 1) - 128 >> 2));
    i_271_ = (int) ((double) i_271_ * 0.3) + 35;
    if (i_271_ < 10)
      i_271_ = 10;
    else if (i_271_ > 60)
      i_271_ = 60;
    return i_271_;
  }
  
  public static boolean method264 (int i, byte[] is, int i_272_, int i_273_)
  {
    boolean bool = true;
    Buffer class39_sub3_sub3
      = new Buffer(is);
    int i_274_ = -1;
    if (i != 49844)
      throw new NullPointerException ();
    for (;;)
      {
	int i_275_ = class39_sub3_sub3.readUSmart();
	if (i_275_ == 0)
	  break;
	i_274_ += i_275_;
	int i_276_ = 0;
	boolean bool_277_ = false;
	for (;;)
	  {
	    if (bool_277_)
	      {
		int i_278_ = class39_sub3_sub3.readUSmart();
		if (i_278_ == 0)
		  break;
		class39_sub3_sub3.readUByte();
	      }
	    else
	      {
		int i_279_ = class39_sub3_sub3.readUSmart();
		if (i_279_ == 0)
		  break;
		i_276_ += i_279_ - 1;
		int i_280_ = i_276_ & 0x3f;
		int i_281_ = i_276_ >> 6 & 0x3f;
		int i_282_ = class39_sub3_sub3.readUByte() >> 2;
		int i_283_ = i_281_ + i_273_;
		int i_284_ = i_280_ + i_272_;
		if (i_283_ > 0 && i_284_ > 0 && i_283_ < 103 && i_284_ < 103)
		  {
		    Class27 class27 = Class27.method272 (i_274_);
		    if (i_282_ != 22 || ! aBoolean318 || class27.aBoolean377
			|| class27.aBoolean360)
		      {
			bool &= class27.method281 (aBoolean305);
			bool_277_ = true;
		      }
		  }
	      }
	  }
      }
    return bool;
  }
  
  public int method265 (int i, int i_285_)
  {
    if (i == -2)
      return 12345678;
    if (i == -1)
      {
	if (i_285_ < 0)
	  i_285_ = 0;
	else if (i_285_ > 127)
	  i_285_ = 127;
	i_285_ = 127 - i_285_;
	return i_285_;
      }
    i_285_ = i_285_ * (i & 0x7f) / 128;
    if (i_285_ < 2)
      i_285_ = 2;
    else if (i_285_ > 126)
      i_285_ = 126;
    return (i & 0xff80) + i_285_;
  }
}
