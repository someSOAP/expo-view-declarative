package expo.modules.viewdeclarative

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// For correct syntax of using ViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun TestForm(viewModel: TestFormModel, onSubmit: (String) -> Unit) {

    val inputText: String by viewModel.inputText.collectAsState()
    val btnText: String by viewModel.btnText.collectAsState()


    Column (
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Card() {
            Column (
                Modifier.padding(vertical = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                TextField(
                    value = inputText,
                    onValueChange = { viewModel.updateInputText(it) }
                )

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Button(
                    onClick = { onSubmit(viewModel.inputText.value) }
                ) {
                    Text(text = btnText)
                }

            }
        }
    }
}


// OPTIONAL - display component preview in Android Studio
@Preview
@Composable
fun TestFormPreview() {
    TestForm(viewModel = TestFormModel(), onSubmit = {})
}