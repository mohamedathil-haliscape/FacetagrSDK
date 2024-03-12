package www.facetagr.com.facetagrsdk;

import android.content.Context;
import android.widget.Toast;

public class MyToast {

    public static void showToast(Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }
}
