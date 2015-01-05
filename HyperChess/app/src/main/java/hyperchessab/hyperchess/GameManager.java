package hyperchessab.hyperchess;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Spellabbet on 2015-01-02.
 */
public final class GameManager {

    public static class SavePiece{

        public SavePiece(){
            name = Settings.defaultPieceName;
            cost = Settings.defaultCost;
            range = Settings.defaultRange;
            health = Settings.defaultHealth;
        }

        public String name;
        public int health,  range, cost;
        public MovePattern pattern = new MovePattern();
    }

    private static ArrayList<SavePiece> playerPieces = new ArrayList<>();
    private static Context context;
    private static Player playerUser, playerOpponent;

    public static Player GetUser(){
        if(playerUser == null){
            playerUser = new Player();
            ArrayList<GamePiece> pieces = new ArrayList<>();
        }
        return playerUser;
    }

    public static Player GetOpponent(){
        if(playerOpponent == null){
            playerOpponent = new Player();
        }
        return playerOpponent;
    }

    public static void Load(Context context){
        GameManager.context = context;
        for (int i = 0; i < Settings.differentPieces; i++) {
            playerPieces.add(new SavePiece());
        }
    }

    public static SavePiece GetSavePiece(int index){
        return playerPieces.get(index);
    }

    public static ArrayList<SavePiece> GetUserSavePieces(){
        return playerPieces;
    }


}
