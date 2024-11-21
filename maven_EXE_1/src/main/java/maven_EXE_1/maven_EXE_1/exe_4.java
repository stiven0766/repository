package maven_EXE_1.maven_EXE_1;

public class exe_4 {
	public static String Compare(double a, double b, String mod) {
		switch(mod) {
		case "regulars":
			if(a<b)
				return "A";
			return "B";
		case "negatives":
			if(-a>=-b)
				return "A";
			return "B";
		case "reciprocals":
			if(1/a>=1/b)
				return "A";
			return "B";
		default:
			break;
		}
		return "Mode not recognized";
	}

}
