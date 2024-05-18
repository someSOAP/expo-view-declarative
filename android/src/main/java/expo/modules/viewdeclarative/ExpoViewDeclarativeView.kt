package expo.modules.viewdeclarative

import android.content.Context
import androidx.compose.ui.platform.ComposeView
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.viewevent.EventDispatcher
import expo.modules.kotlin.views.ExpoView

class ExpoViewDeclarativeView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    val viewModel = TestFormModel()

    private val onSubmit by EventDispatcher()

    internal val composeView = ComposeView(context).also {

        it.layoutParams = LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )

        it.setContent {
            TestForm(
                viewModel = viewModel,
                onSubmit = { onSubmit(mapOf("inputText" to it)) }
            )
        }


        addView(it)
    }


}
