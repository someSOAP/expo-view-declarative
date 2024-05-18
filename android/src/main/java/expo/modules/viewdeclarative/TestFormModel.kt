package expo.modules.viewdeclarative

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TestFormModel : ViewModel() {
    private val _inputText = MutableStateFlow("Initial Input")
    private val _btnText = MutableStateFlow("")

    val inputText: StateFlow<String> get() = _inputText
    val btnText: StateFlow<String> get() = _btnText


    fun updateInputText(newValue: String) {
        _inputText.value = newValue
    }

    fun updateBtnText(newValue: String) {
        _btnText.value = newValue
    }
}
