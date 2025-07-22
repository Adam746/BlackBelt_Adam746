public class TowersOfHanoiVisual {
    private static final int NUM_DISKS = 3;
    private static String[][] towers; // Visual representation of towers

    public static void main(String[] args) {
        towers = new String[NUM_DISKS][3]; // N disks, 3 towers
        initializeTowers();
        printTowers();
        moveDisks(NUM_DISKS, 0, 2, 1);
    }

    private static void initializeTowers() {
        for (int i = 0; i < NUM_DISKS; i++) {
            for (int j = 0; j < 3; j++) {
                towers[i][j] = "   |   "; // Initial state with all disks on the first rod
            }
            towers[i][0] = String.format(" %d%d%d ", i+1, i+1, i+1); // Populate the first tower with disks
        }
    }

    private static void printTowers() {
        for (int i = 0; i < NUM_DISKS; i++) {
            for (int j = 0; j < 3; j++) {
                if (towers[i][j].equals("   |   ")) {
                    System.out.print(towers[i][j]);
                }
                else {
                    System.out.print(" ");
                    System.out.print(towers[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("=================");
    }

    private static void moveDisks(int n, int fromRod, int toRod, int auxRod) {
        if (n == 1) {
            System.out.println("Move disk from rod " + (fromRod + 1) + " to rod " + (toRod + 1));
            moveDiskVisual(fromRod, toRod);
            printTowers();
            return;
        }
        moveDisks(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk from rod " + (fromRod + 1) + " to rod " + (toRod + 1));
        moveDiskVisual(fromRod, toRod);
        printTowers();
        moveDisks(n - 1, auxRod, toRod, fromRod);
    }

    private static void moveDiskVisual(int fromRod, int toRod) {
        // Find the top disk of fromRod
        int diskToMove = -1;
        for (int i = 0; i < NUM_DISKS; i++) {
            if (!towers[i][fromRod].equals("   |   ")) {
                diskToMove = i;
                break;
            }
        }

        // Move the disk to toRod
        if (diskToMove != -1) {
            for (int i = NUM_DISKS - 1; i >= 0; i--) {
                if (towers[i][toRod].equals("   |   ")) {
                    towers[i][toRod] = towers[diskToMove][fromRod];
                    towers[diskToMove][fromRod] = "   |   ";
                    break;
                }
            }
        }
    }
}
