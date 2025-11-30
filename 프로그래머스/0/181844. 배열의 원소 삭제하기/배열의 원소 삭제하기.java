class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len1 = arr.length;
        int len2 = delete_list.length;
        int a = 0;
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(arr[i] == delete_list[j]){
                    a++;
                }
            }
        }
        int [] result = new int[len1 - a];
        int b = 0;
        for(int i = 0; i < len1; i++){
            boolean d = false;
            for(int j = 0; j < len2; j++){
                if(arr[i] == delete_list[j]){
                    d = true;
                    break;
                }
            }
            if(!d){
                result[b++] = arr[i];
            }
        }
          return result;
    }
  
}