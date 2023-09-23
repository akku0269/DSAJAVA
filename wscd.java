public class wscd {
    public static void main(String[] args) {
        String s ="";
        int i=0;
        if(s[i]=='I' && s.charAt(i+1)=="V"){ ans+=4 ; i+=2;}
        else if(s.charAt(i)=='I' && s.charAt(i+1)=='X') { ans+=9; i+=2;}
        else if(s.charAt(i)=='I') { ans++; i++;}
        else if(s.charAt(i)=='V') {ans = ans+5; i++;}
        else if(s.charAt(i)=='X' && s.charAt(i+1)=='L') { ans+=40; i+=2;}
        else if(s.charAt(i)=='X' && s.charAt(i+1)=='C') { ans+=90; i+=2;}
        else if(s.charAt(i)=='X') {ans = ans+10; i++;}
        else if(s.charAt(i)=='L') {ans = ans+50; i++;}
        else if(s.charAt(i)=='C' &&s.charAt(i+1)=='M') { ans+=900; i+=2;}
        else if(s.charAt(i)=='C' &&s.charAt(i+1)=='D') { ans+=400; i+=2;}
        else if(s.charAt(i)=='C') {ans = ans+100;i++;}
        else if(s.charAt(i)=='D') {ans = ans+500;i++;}
        else if(s.charAt(i)=='M') {ans = ans+1000;i++;}
        else if(s.charAt(i)==' ') break;
        s.charAt(i)Eque
    }
}
