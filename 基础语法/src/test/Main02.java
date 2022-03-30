package test;

import java.io.*;
import java.util.*;
/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Main02{
    public static int pre[];
    public static int m,n;
    public static Edge []edges;
    static class Edge implements Comparable<Edge>{
        public int u,v,w;
        public int compareTo(Edge e){
            return this.w-e.w;
        }

    }
    public static int find(int x){
        int r = x;
        while(pre[r]!=r) r=pre[r];
        int j=x,tmp;
        while(j!=r)
        {
            tmp = pre[j];
            pre[j] = r;
            j = tmp;
        }
        return r;
    }
    public static int kruskal(){
        int tot=1,sum=0;
        for(int i=1;i<=m&&tot<=n;i++)   //i代表边，toto代表已经连接的村庄数量
        {

            int a = find(edges[i].u);
            int b = find(edges[i].v);
            if(a!=b){
                sum+=edges[i].w;
                pre[a] = b;
                tot++;
            }
        }
        return sum;
    }
    //解决javaIO读取过慢的方法，利用该类读取输入数据，不要用Scanner！！！
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
    public static  void main(String []args) {
        InputReader sc = new InputReader(System.in);  //用它来代替Scanner。
        while(true){
            n = sc.nextInt();
            m = n*(n-1)/2;

            if(n==0) break;
            pre = new int[n+1];
            for(int i=1;i<=n;i++)
                pre[i] = i;

            edges = new Edge[m+1];
            for(int i=1;i<=m;i++)
                edges[i] = new Edge();
            int c;
            for(int i=1;i<=m;i++)
            {
                edges[i].u = sc.nextInt();
                edges[i].v = sc.nextInt();
                edges[i].w = sc.nextInt();
                c = sc.nextInt();
                if(c==1) edges[i].w = 0;
            }
            Arrays.sort(edges,1,edges.length);
            System.out.println(kruskal());
        }
    }
}
