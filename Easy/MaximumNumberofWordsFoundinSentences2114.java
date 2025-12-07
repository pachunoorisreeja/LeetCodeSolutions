package Easy;

public class MaximumNumberofWordsFoundinSentences2114 {
    public static void main(String[] args) {
        String s[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println("Max Count: "+mostWordsFound(s));
    }
    public static int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i=0;i<sentences.length;i++){
            int wordsCount = sentences[i].split(" ").length;
            if(max < wordsCount){
                max = wordsCount;
            }
        }
        return max;}
}
