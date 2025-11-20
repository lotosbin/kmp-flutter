//
//  FlutterView.swift
//  iosApp
//
//  Created by liubinbin on 11/20/25.
//
import UIKit
import SwiftUI
import Flutter

struct FlutterViewControllerRepresentable: UIViewControllerRepresentable {

  func makeUIViewController(context: Context) -> some UIViewController {
    return FlutterViewController(
      project: nil,
      initialRoute: "/",
      nibName: nil,
      bundle: nil)
  }

  func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
}
