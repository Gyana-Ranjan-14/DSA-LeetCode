//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    
    public void permute(String s, int l, int r, Set<String> ans) {
        // Base case
        if (l == r)
            ans.add(s);
        else {
            // Permutations made
            for (int i = l; i <= r; i++) {
                // Swapping done
                s = swap(s, l, i);
                // Recursion called
                permute(s, l + 1, r, ans);
                // Backtrack
                s = swap(s, l, i);
            }
        }
    }
    
    // for swapping element 
     private String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray(); //convert string to chararray
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray); // again convert to string
    }
    public List<String> find_permutation(String S) {
        // Code here
        int n = S.length(); // find the length
        Set<String> ans = new HashSet<>(); // use hahset for no duplicay
        permute(S, 0, n - 1, ans); // call the permute function
        List<String> result = new ArrayList<>(ans);
        Collections.sort(result);
        return result; // return the a new ans arraylist.
    }
}