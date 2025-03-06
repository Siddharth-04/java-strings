class ToggleCaseConverter{
    public static void main(String[] args) {
        String str = "ConvertThisSTRing";
        String result = "";

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                char ch = (char)(str.charAt(i) - 'A' + 'a');
                result += ch;
            }
            else{
                char ch = (char)(str.charAt(i) - 'a' + 'A');
                result += ch;
            }
        }

        System.out.println("Toogle case converted string : " + result);
    }
}

//Toogle case converted string : cONVERTtHISstrING