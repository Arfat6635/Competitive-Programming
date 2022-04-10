public class camelCase {

    public static void main(String[] args) {
        String s = "Take a string input from the user and store it in the variable called '“s'”";
        String fchar, lchar, mchar;
        String[] words = s.split("\\W+");
        String result="";
        for (String string : words) {
            if (string.length()==1) {
             result+=string.toUpperCase()+ " ";   
            }else if(string.length()==2){
                int length=string.length();
             fchar=string.substring(0,1);
             lchar=string.substring(length-1,length);
             result+= fchar.toUpperCase()+lchar.toUpperCase()+" ";
            }
            else{
            int length=string.length();
             fchar=string.substring(0,1);
             lchar=string.substring(length-1,length);
             mchar=string.substring(1,length-1);
             result+= fchar.toUpperCase()+mchar+lchar.toUpperCase()+" ";
            }
        }
        System.out.println(result);

}
    
}
