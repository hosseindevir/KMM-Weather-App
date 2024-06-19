import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        #if DEBUG
            NapierHelperKt.initializeNapier()
        #endif
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
