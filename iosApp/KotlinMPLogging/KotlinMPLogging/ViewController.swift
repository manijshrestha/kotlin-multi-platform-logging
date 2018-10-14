//
//  ViewController.swift
//  KotlinMPLogging
//
//  Created by Manij Shrestha on 10/14/18.
//  Copyright © 2018 Manij Shrestha. All rights reserved.
//

import UIKit
import common

class ViewController: UIViewController {

    let anatlyicsManager = IosAnalyticsManager()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // Report page is viewed
        anatlyicsManager.report(event: ViewEvent.init(pageName: "Main Page"))
    }

    @IBAction func redButtonClicked(_ sender: Any) {
        anatlyicsManager.report(event: ButtonClickEvent.init(buttonName: "Red"))
    }
    
    @IBAction func greenButtonClicked(_ sender: Any) {
        anatlyicsManager.report(event: ButtonClickEvent.init(buttonName: "Green"))
    }
    
    @IBAction func blueButtonClicked(_ sender: Any) {
        anatlyicsManager.report(event: ButtonClickEvent.init(buttonName: "Blue"))
    }
    
}

