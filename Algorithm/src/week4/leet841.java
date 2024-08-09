package week4;
import java.util.*;

public class leet841 {
    boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];

        openRoom(0, rooms);

        for (boolean isOpen : visited) {
            if (!isOpen)
                return false;
        }

        return true;
    }

    public void openRoom(int i, List<List<Integer>> rooms) {
        visited[i] = true;

        for (int key : rooms.get(i)) {
            if(!visited[key])
                openRoom(key, rooms);
        }
    }
}
