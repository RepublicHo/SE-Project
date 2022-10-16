package main.model.Chesses;

import main.model.Square;
import main.model.Type;
import main.utils.Location;
import main.utils.Side;

import static java.lang.Math.abs;
import static main.model.Chesses.Animal.*;
/**
 * @Author Anthony Z.
 * @Date 6/10/2022
 * @Description:
 */
public class Lion extends Chess{
    public Lion(Location location, Side side) {
        super(location, LIO, side);
    }

    public boolean canMoveToEmpty(Location destination, Square square){
        int dx = destination.getRow();
        int dy = destination.getCol();
        int x = location.getRow();
        int y = location.getCol();

//        if(dx<1 || dx>9 || dy<1 || dy>7){
//            return false;
//        }
        if(square.getType()== Type.RIVER){
            return false;
        }
        if(square.getType()==Type.DEN1 && side == Side.Red){
            return false;
        }
        if(square.getType()==Type.DEN2 && side == Side.Blue){
            return false;
        }
        if(dx==x && abs(dy-y)==1){
            return true;
        }
        if(dy==y && abs(dx-x)==1){
            return true;
        }

        /**
         * Jump over the river
         * Special case to be checked by Chessboard: rat in the river
         */
        if(x>=4 && x<=6 && dx==x && abs(dy-y)==3){
            return true;
        }
        if((x==3 || x==7) && (y==2 || y==3 || y==5 || y==6) && y==dy && abs(x-dx)==4){
            return true;
        }

        return false;
    }
}
