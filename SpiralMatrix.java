package Array;


import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] mat) {

        ArrayList<Integer> ans = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;

        int fc= 0;
        int lc = n-1;
        int fr = 0;
        int lr = m-1;

        while(fc<=lc && fr<=lr){
            for(int j=fc; j<=lc; j++){
                ans.add(mat[fr][j]);
            }
            fr++;
            if(fr>lr || fc>lc)break;
            for(int i=fr; i<=lr; i++){
                ans.add(mat[i][lc]);
            }
            lc--;
            if(fr>lr || fc>lc)break;
            for(int j=lc; j>= fc; j--){
                ans.add(mat[lr][j]);
            }
            lr--;

            if(fr>lr || fc>lc)break;
            for(int i=lr; i>=fr; i--){
                ans.add(mat[i][fc]);
            }
            fc++;

        }
        return ans;
    }
}
