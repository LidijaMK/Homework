package namudarbai;

public class Masyvasmaz {

    public static void main(String[] args) {
        // surusiuoti masyvo elementus mazejimo tvarka
        // {123, 5, -1, -7}

        int[] masyvas = {123, -1, 5, -7};

        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) {
                    int tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }
        }
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }

    }
}
