//
//  IosAnalyticsManager.swift
//  KotlinMPLogging
//
//  Created by Manij Shrestha on 10/14/18.
//  Copyright © 2018 Manij Shrestha. All rights reserved.
//

import Foundation
import common

class IosAnalyticsManager : AnalyticsManager {
    
    func report(event: Event) {
        print("Interaction \(event.eventName()) happened with property \(event.eventProperties().debugDescription)")
    }
}
