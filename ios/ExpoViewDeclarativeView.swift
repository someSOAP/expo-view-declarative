import ExpoModulesCore
import SwiftUI
import UIKit

// This view will be used as a native component. Make sure to inherit from `ExpoView`
// to apply the proper styling (e.g. border radius and shadows).
class ExpoViewDeclarativeView: ExpoView {
    
    private let contentView: UIHostingController<TestForm>
    
    required init(appContext: AppContext? = nil) {
        contentView = UIHostingController(rootView: TestForm())
        
        super.init(appContext: appContext)
        
        clipsToBounds = true
        addSubview(contentView.view)
    }
    
    override func layoutSubviews() {
        contentView.view.frame = bounds
    }
}
