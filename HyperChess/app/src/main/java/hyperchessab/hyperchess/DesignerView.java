package hyperchessab.hyperchess;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;

/**
 * Created by jespe_000 on 2014-12-30.
 */
public class DesignerView extends GameView {
    public DesignerView(Context context) {
        super(context);
        game = new Designer(context, camera);
    }

    public DesignerView(Context context, AttributeSet attr) {
        super(context, attr);
        game = new Designer(context, camera);
    }

    public DesignerView(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
        game = new Designer(context, camera);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getActionMasked();
        return false;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        game.Draw(canvas);
    }


}