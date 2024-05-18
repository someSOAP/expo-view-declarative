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

@Composable
fun TestForm() {
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
                    value = "Value",
                    onValueChange = { /*TODO*/ },
                )

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Click me!")
                }

            }
        }
    }
}


// OPTIONAL - display component preview in Android Studio
@Preview
@Composable
fun TestFormPreview() {
    TestForm()
}