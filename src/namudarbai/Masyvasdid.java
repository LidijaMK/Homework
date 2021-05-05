package namudarbai;

public class Masyvasdid {

    public static void main(String[] args) {

        // surusiuoti masyvo elementus didejimo tvarka
        // {-7, -1, 5, 123}

        int[] masyvas = {123, -1, 5, -7};

        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) {
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
