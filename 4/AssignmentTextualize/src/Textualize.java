public class Textualize {
    public String digit1(int value){
        switch(value){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    
    public String digit2(String value){
        StringBuilder texted = new StringBuilder();
        char CharOnes = value.charAt(1);
        int IntOnes = CharOnes - '0';
        char CharTens = value.charAt(0);
        int IntTens = CharTens - '0';
        switch(IntTens){
            case 1: 
                switch(IntOnes){
                    case 0: return "ten";
                    case 1: return "eleven";
                    case 2: return "twelve";
                    case 3: return "thirteen";
                    case 4: return "fourteen";
                    case 5: return "fifteen";
                    case 6: return "sixteen";
                    case 7: return "seventeen";
                    case 8: return "eighteen";
                    case 9: return "nineteen";
                }
            case 2: texted.append("twenty"); break;
            case 3: texted.append("thirty"); break;
            case 4: texted.append("forty"); break;
            case 5: texted.append("fifty"); break;
            case 6: texted.append("sixty"); break;
            case 7: texted.append("seventy"); break;
            case 8: texted.append("eighty"); break;
            case 9: texted.append("ninety"); break;
        }
        if (IntOnes > 0) {
            texted.append(" ").append(digit1(IntOnes)); 
        }
        return texted.toString();
    }

    public String digit3(String value){
        StringBuilder SBTexted = new StringBuilder();
        char CharHundreds = value.charAt(0);
        int IntHundreds = CharHundreds - '0';
        String SubNumber = value.substring(1, 3);
        if (IntHundreds > 0) {
            SBTexted.append(digit1(IntHundreds)).append(" hundred ");
            if (!SubNumber.equals("00")) {
                SBTexted.append("and");
            }
        }
        int IntSubNumber = Integer.parseInt(SubNumber);
        if (IntSubNumber > 0) {
            SBTexted.append(" ").append(digit2(SubNumber)); 
        }
        return SBTexted.toString();
    }
}