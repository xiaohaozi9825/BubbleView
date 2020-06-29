package pw.xiaohaozitest.bubbleview;

import androidx.appcompat.app.AppCompatActivity;
import pw.xiaohaozi.bubbleview.BubbleView;

import android.graphics.Path;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BubbleView mBvDefaule;
    private BubbleView mBvGuanji;
    private BubbleView mBubbleView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBvDefaule = findViewById(R.id.bv_defaule);
        mBvGuanji = findViewById(R.id.bv_guanji);
        mBubbleView4 = findViewById(R.id.bubble_view_4);
        mBubbleView4.setDrawIndicator(new BubbleView.DrawIndicator() {
            @Override
            public void drawLeft(Path path, int left, int top, int right, int bottom) {
                int w = right - left;
                int h = bottom - top;
                path.moveTo(right, top + h / 2);
//                path.lineTo(left, top);
                path.arcTo(
                        left,
                        top - h * 3 / 2,
                        right + h,
                        bottom - h / 2,
                        90,
                        72,
                        false
                );
                path.arcTo(
                        left,
                        top - h,
                        right + h,
                        bottom,
                        180,
                        -90,
                        false
                );
                path.lineTo(right, bottom);

            }

            @Override
            public void drawTop(Path path, int left, int top, int right, int bottom) {

            }

            @Override
            public void drawRight(Path path, int left, int top, int right, int bottom) {

            }

            @Override
            public void drawBottom(Path path, int left, int top, int right, int bottom) {

            }
        });
    }
}