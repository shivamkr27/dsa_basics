import java.util.*;

public class SofaSimpleBasic {

    static int M,N;
    static char[][] grid;
    static boolean[][][][] visited;
    static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}}; // up,down,left,right

    static boolean free(int r,int c){
        return r>=0 && r<M && c>=0 && c<N && grid[r][c]!='H';
    }

    static boolean canRotate(int r1,int c1,int r2,int c2){
        int minR = Math.min(r1,r2), minC = Math.min(c1,c2);
        int maxR = Math.max(r1,r2), maxC = Math.max(c1,c2);
        if(maxR - minR ==1 && maxC - minC ==0){ // vertical
            if(minC+1<N && free(minR,minC+1) && free(maxR,minC+1)) return true;
            if(minC-1>=0 && free(minR,minC-1) && free(maxR,minC-1)) return true;
        } else if(maxR - minR==0 && maxC - minC==1){ // horizontal
            if(minR+1<M && free(minR+1,minC) && free(minR+1,maxC)) return true;
            if(minR-1>=0 && free(minR-1,minC) && free(minR-1,maxC)) return true;
        }
        return false;
    }

    static int bfs(int sr1,int sc1,int sr2,int sc2,int gr1,int gc1,int gr2,int gc2){
        int max = M*N*M*N;
        int[][] queue = new int[max][5]; // r1,c1,r2,c2,steps
        int head=0, tail=0;
        queue[tail++] = new int[]{sr1,sc1,sr2,sc2,0};

        visited[sr1][sc1][sr2][sc2] = true;
        visited[sr2][sc2][sr1][sc1] = true;

        while(head<tail){
            int[] cur = queue[head++];
            int r1=cur[0], c1=cur[1], r2=cur[2], c2=cur[3], steps=cur[4];

            // goal check
            if((r1==gr1 && c1==gc1 && r2==gr2 && c2==gc2) || 
               (r1==gr2 && c1==gc2 && r2==gr1 && c2==gc1)) return steps;

            // slide
            for(int[] d: dirs){
                int nr1=r1+d[0], nc1=c1+d[1], nr2=r2+d[0], nc2=c2+d[1];
                if(free(nr1,nc1) && free(nr2,nc2) && !visited[nr1][nc1][nr2][nc2]){
                    visited[nr1][nc1][nr2][nc2]=true;
                    visited[nr2][nc2][nr1][nc1]=true;
                    queue[tail++] = new int[]{nr1,nc1,nr2,nc2,steps+1};
                }
            }

            // rotate
            if(canRotate(r1,c1,r2,c2)){
                int minR = Math.min(r1,r2), minC=Math.min(c1,c2);
                int maxR = Math.max(r1,r2), maxC=Math.max(c1,c2);
                if(maxR - minR ==1 && maxC - minC==0){ // vertical -> horizontal
                    int[][] rot={{minR,minC,minR,minC+1},{maxR,minC,maxR,minC+1}};
                    for(int[] s: rot){
                        if(!visited[s[0]][s[1]][s[2]][s[3]]){
                            visited[s[0]][s[1]][s[2]][s[3]]=true;
                            visited[s[2]][s[3]][s[0]][s[1]]=true;
                            queue[tail++] = new int[]{s[0],s[1],s[2],s[3],steps+1};
                        }
                    }
                } else { // horizontal -> vertical
                    int[][] rot={{minR,minC,minR+1,minC},{minR,maxC,minR+1,maxC}};
                    for(int[] s: rot){
                        if(!visited[s[0]][s[1]][s[2]][s[3]]){
                            visited[s[0]][s[1]][s[2]][s[3]]=true;
                            visited[s[2]][s[3]][s[0]][s[1]]=true;
                            queue[tail++] = new int[]{s[0],s[1],s[2],s[3],steps+1};
                        }
                    }
                }
            }
        }

        return -1; // impossible
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        M=sc.nextInt(); N=sc.nextInt();
        grid = new char[M][N];
        visited = new boolean[M][N][M][N];

        int sr1=-1,sc1=-1,sr2=-1,sc2=-1;
        int gr1=-1,gc1=-1,gr2=-1,gc2=-1;

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                grid[i][j] = sc.next().charAt(0);
                if(grid[i][j]=='s'){
                    if(sr1==-1){sr1=i; sc1=j;}
                    else {sr2=i; sc2=j;}
                }
                if(grid[i][j]=='S'){
                    if(gr1==-1){gr1=i; gc1=j;}
                    else {gr2=i; gc2=j;}
                }
            }
        }

        int ans = bfs(sr1,sc1,sr2,sc2,gr1,gc1,gr2,gc2);
        System.out.println(ans==-1?"Impossible":ans);
    }
}
