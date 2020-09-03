
public class Boom {

	public  String Convert(int A) {
		if(A<0 || A>9999) {
			return "Number is out of range";
		}else {
			String Number = "";
			String test = "";
			int thousand = A/1000;
			int hundred = (A%1000)/100;
			int tens = (A%100)/10;
			int unit = (A%10);
			
			test = checkNo(thousand,0);
			if(test!="") {
				Number +=test+" Thousand ";
			}
			test = checkNo(hundred,0);
			if(test!="") {
				Number +=test+" Hundred ";
			}
			if((tens!= 0 || unit!=0)&&!(thousand ==0 && hundred ==0)) {
				Number+="And ";
			}
			if(tens == 1 && unit !=0) {
				test = checkNo(unit,2);
				Number+=test;
			} else {
				test = checkNo(tens,1);
				if(test!="") {
					Number +=test+" ";
				}
				test = checkNo(unit,0);
				if(test!="") {
					Number +=test;
				}
			}
			if(thousand ==0&&hundred==0&&tens==0&&unit==0) {
				Number+="Zero";
			}
			return Number;
		}

	}
	
	private String checkNo(int input,int type) {
		if(input == 0) {
			return "";
		} else {
			if(type == 0) {return Number(input);}
			else if(type == 1) {return(tenDigit(input));}
			else {return(tenPlus(input));}
			}
	}
	
	private String Number(int input) {
		switch(input) {
			case 1: return "One";
			case 2: return "Two";
			case 3: return "Three";
			case 4: return "Four";
			case 5: return "Five";
			case 6: return "Six";
			case 7: return "Seven";
			case 8: return "Eight";
			case 9: return "Nine";
		}
		return "";
	}
	
	private String tenDigit(int input) {
		switch(input) {
			case 1: return "Ten";
			case 2: return "Twenty";
			case 3: return "Thirty";
			case 4: return "Fourty";
			case 5: return "Fifthty";
			case 6: return "Sixty";
			case 7: return "Seventy";
			case 8: return "Eighty";
			case 9: return "Ninety";
		}
		return "";
	}
	
	private String tenPlus(int input) {
		switch(input) {
			case 1: return "Eleven";
			case 2: return "Twelve";
			case 3: return "Thirteen";
			case 4: return "Fourteen";
			case 5: return "Fifthteen";
			case 6: return "Sixteen";
			case 7: return "Seventeen";
			case 8: return "Eighteen";
			case 9: return "Nineteen";
			}
		return "";
	}
}
