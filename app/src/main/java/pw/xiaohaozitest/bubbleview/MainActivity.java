package pw.xiaohaozitest.bubbleview;

import androidx.appcompat.app.AppCompatActivity;
import pw.xiaohaozi.bubbleview.BubbleView;

import android.graphics.Color;
import android.graphics.Path;
import android.os.Bundle;
import android.widget.TextView;

import static pw.xiaohaozi.bubbleview.BubbleView.IndicatorDirection.TOP;

public class MainActivity extends AppCompatActivity {
    private BubbleView mBvDefaule;
    private BubbleView mBvGuanji;
    private BubbleView mBubbleView4;
    private BubbleView mBubbleView5;
    private TextView mTv1;
    private BubbleView mBv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBvDefaule = findViewById(R.id.bv_defaule);
        mBvGuanji = findViewById(R.id.bv_guanji);
        mBubbleView4 = findViewById(R.id.bubble_view_4);
        mBubbleView5 = findViewById(R.id.bubble_view_5);
        mTv1 = findViewById(R.id.tv_1);
        mBv1 = findViewById(R.id.bv_1);
        mTv1.postDelayed(() ->{
//            mBv1.setIndicatorLocation(0.1f);
//            mBv1.setIndicatorHeight(96);
//            mBv1.setIndicatorWidth(64);
            mBv1.setFillIndicator(true);
//            mBv1.setIndicatorDirection(TOP);
//            mBv1.setBubbleColor(Color.BLUE);
//            mBv1.setShadowColor(Color.BLUE);
//            mTv1.setText("123456zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        },3000);

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
        mBubbleView5.setDrawIndicator(new BubbleView.DrawIndicator() {
            @Override
            public void drawLeft(Path path, int left, int top, int right, int bottom) {

            }

            @Override
            public void drawTop(Path path, int left, int top, int right, int bottom) {

            }

            @Override
            public void drawRight(Path path, int left, int top, int right, int bottom) {
                int w = right - left;
                int h = bottom - top;

                path.moveTo(left, top + h / 2);
//                path.lineTo(right, top);
                path.arcTo(
                        left-h,
                        top - h * 3 / 2,
                        right,
                        bottom - h / 2,
                        90,
                        -72,
                        false
                );
                path.arcTo(
                        left-h,
                        top-h ,
                        right ,
                        bottom,
                        0,
                        90,
                        false
                );
                path.lineTo(left, bottom);

            }

            @Override
            public void drawBottom(Path path, int left, int top, int right, int bottom) {

            }
        });
    }
}