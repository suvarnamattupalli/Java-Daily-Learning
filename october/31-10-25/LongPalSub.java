class LongPalSub{
    public static void main(String args[]){
        String s="babad";
        String word="";
        String s1="",s2="";
        int max=0;
    for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<s.length()+1;j++)
        {
            word=(s.substring(i,j));
            StringBuffer sb=new StringBuffer(word);
            sb.reverse();
            s1=sb.toString();
            if(s1.equals(word))
            {
                if(word.length()>max)
                {
                    max=word.length();
                    s2=word;
                }
            }
        }
    }
    System.out.print("Longest Palindromic Substring: "+s2+ " its length - "+max);
    }
    
}