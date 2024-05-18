import SwiftUI


class TestFormViewModel : ObservableObject {
    @Published var inputText = "Initial Value"
    @Published var btnText = ""
}

struct TestForm: View {
    
    @StateObject var viewModel: TestFormViewModel
    
    var onSubmit: (String) -> Void

    
    var body: some View {
        VStack {
            VStack{
                TextField(
                    "Input",
                    text: $viewModel.inputText
                )
                .textFieldStyle(.roundedBorder)
                
                Spacer()
                    .frame(height: 25)
                
                Button(action: {
                    onSubmit(viewModel.inputText)
                }) {
                    Text(viewModel.btnText)
                        .foregroundColor(.white)
                        .padding(10)
                        .background(Color.blue)
                        .cornerRadius(10)
                }
                
            }
            .padding()
            .background(Color.gray.opacity(0.5))
            .cornerRadius(10)
            
        }
        .padding()
    }}
