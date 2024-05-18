import SwiftUI

struct TestForm: View {
    var body: some View {
        VStack {
            VStack{
                TextField(
                    "Input",
                    text: .constant("Value")
                )
                .textFieldStyle(.roundedBorder)
                
                Spacer()
                    .frame(height: 25)
                
                Button(action: {
                    // TODO
                }) {
                    Text("Click me")
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
