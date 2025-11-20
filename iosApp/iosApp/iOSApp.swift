import SwiftUI
import ComposeApp
import Flutter

@main
struct iOSApp: App {
    @UIApplicationDelegateAdaptor(AppDelegate.self) var appDelegate

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

class AppDelegate: UIResponder, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        // Set the factory at app launch using the shared engine.
        FlutterViewFactoryKt.setFlutterViewFactory(factory: { entrypoint, initialRoute in
            let engine = FlutterEngine()
            engine.run(withEntrypoint: entrypoint, initialRoute: initialRoute)
            return FlutterViewController(
                engine: engine,
                nibName: nil,
                bundle: nil)
        })
        return true
    }
}