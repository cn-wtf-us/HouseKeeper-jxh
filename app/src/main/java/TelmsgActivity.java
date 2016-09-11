import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import cn.feicui.com.housekeeper.R;

/**
 * Created by pc on 2016/9/11.
 */
public class TelmsgActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telmsg);

        ListView listView= (ListView) findViewById(R.id.Listview);
    }
}
