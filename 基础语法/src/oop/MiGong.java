package oop;

public class MiGong {

    public static void main(String[] args) {

        Tool t = new Tool();
        char[][] map = new char[8][7];
        System.out.println("打印地图:");
        for (int i = 0; i < map.length; i++) {//外循环次数为二维数组的行数 即array.length-1次
            for (int j = 0; j < map[i].length; j++) {//内循环次数为一维数组的长度 即array[i].length-1次
                map[i][0] = '*';
                map[i][6] = '*';
                map[0][j] = '*';
                map[7][j] = '*';
            }

        }
        map[3][1] = '*';
        map[2][2] = '*';
        map[3][2] = '*';
        map[4][5] = '*';
        map[5][4] = '*';

        t.sort(map);

        t.findWay(map,1,1);
        System.out.println("路径:");
        t.sort(map);
    }

}

class Tool {


    public boolean findWay(char[][] map, int i, int j) {
        //空表示路,*表示墙,>表示走过的路,x表示走过但走不通的死路
        //起始位置为(1,1),终点为(6,5)
        //策略为下->右->上->左
        if (map[6][5] == '>') {//表示已经到终点了
            return true;
        }else if(map[i][j] == '\u0000'){//表示可以走
            //先假定当前位置可以走通
            map[i][j]='>';
            //开始使用策略
            if (findWay(map,i+1,j)){//如果将地图传入,并且先向下走

                return true;

            }else if (findWay(map,i,j+1)){//向右走

                return true;

            }else if (findWay(map,i-1,j)){//向上走

                return true;

            }else if (findWay(map,i,j-1)){//向左走

                return true;

            }else{
                map[i][j]='x'; //四个方向都走不通判定为死路
                return false;
            }

        }else{//可能的情况---1(是墙),2(来路先不回去),3(死路)
            return false;
        }

    }

    public void sort(char[][] array) {//遍历方法
        for (int i = 0; i < array.length; i++) {//外循环次数为二维数组的行数 即array.length-1次
            for (int j = 0; j < array[i].length; j++) {//内循环次数为一维数组的长度 即array[i].length-1次
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
