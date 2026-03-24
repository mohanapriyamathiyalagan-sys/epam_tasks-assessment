package core_java.hometask_languageConstructs;

public class LanguageConstructs {
    public int caughtSpeeding(int speed, boolean birthday){
        if(birthday) speed = speed-5;
        if(speed<=60) return 0;
        else if( speed<=80) return 1;
        else return 2;

    }
    public boolean love6(int a, int b){
        if(a==6||b==6) return true;
        if(a+b==6) return true;
        if(Math.abs(a-b)==6) return true;

        return false;
    }

    public  int teaParty(int tea, int candy){
        if(tea<=5 || candy<=5) return 0;
        if(tea>=candy*2 || candy>=tea*2) return 2;
        return 1;
    }

    public int blueTicket(int a, int b, int c){
        int ab = a+b;
        int bc = b+c;
        int ac = a+c;
        if(ab==10 ||bc ==10||ac==10) return 10;
        if(ab==bc+10 ||ab==ac+10) return 5;

        return 0;
    }

    public boolean inOrder(int a, int b,int c, boolean b0k){
        if(b0k) return c>b;
        return (b>a && c>b);
    }

    public boolean shareDigit(int a, int b){
        int a1=a/10;
        int a2=a%10;
        int b1 = b/10;
        int b2=b%10;

        return (a1==b1||a1==b2||a2==b1||a2==b2);
    }

    public int sumLimit(int a, int b){
        int sum = a+b;
        if(String.valueOf(sum).length()==String.valueOf(a).length()) return sum;

        return a;
    }

    public String withoutString(String base, String remove){
        return base.replaceAll("(?i)"+remove,"");
    }

    public int maxBlock(String str){
        int max=0, count =1;
        for(int i=1;i<str.length();i++) {
            if (str.charAt(i) == str.charAt(i - 1))
                count++;
            else
                count = 1;
            if (count > max) max = count;
        }
        return max;
    }


}