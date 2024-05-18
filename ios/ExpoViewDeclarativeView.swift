import ExpoModulesCore
import SwiftUI
import UIKit

// This view will be used as a native component. Make sure to inherit from `ExpoView`
// to apply the proper styling (e.g. border radius and shadows).
class ExpoViewDeclarativeView: ExpoView {
    
    private let contentView: UIHostingController<TestForm>
    let viewModel = TestFormViewModel()
    let onSubmit: EventDispatcher
    
    required init(appContext: AppContext? = nil) {
        onSubmit = EventDispatcher()
        
        var handleSubmit: ((String) -> Void)?
        
        contentView = UIHostingController(
            rootView: TestForm(
                viewModel: self.viewModel,
                onSubmit: { inputText in
                    handleSubmit?(inputText)
                }
            )
        )
        
        super.init(appContext: appContext)
        
        handleSubmit = { inputText in self.onSubmit(["inputText": inputText]) }
        
        clipsToBounds = true
        addSubview(contentView.view)
    }
    
    override func layoutSubviews() {
        contentView.view.frame = bounds
    }
}
