package Problems.firstNonRepeating;

/**
 * Created by Sadasiva.Kuppaswamy on 22-05-2016.
 */
public class firstoccurance {
    public static void main(String args[]){
        char [] a ={'h','h','l','l','o'};
//Scanner sc=new Scanner(System.in);
        String s=new String(a);//sc.next();
        char c;
        int i;
        int length=s.length();
        for(i=0;i<length;i++)
        {
            c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                System.out.println("first non repeating char in a string   "+c);
                break;
            }
            else if(i==length-1)
            {
                System.out.println("no single char");
            }
        }
    }
}
/*
for(i=0;i<str.length;i++)
{
 HashSet hashSet=new HashSet<>()
 if(!hashSet.add(str[i))
   hashSet.remove(str[i])
 }
 hashset.get(0) will give the non repeated character.
 */