package expo.modules.viewdeclarative

import android.content.Context
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

class ExpoViewDeclarativeView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    internal val composeView = ComposeView(context).also {

        it.layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )

        it.setContent {
            TestForm()
        }


        addView(it)
    }
}
