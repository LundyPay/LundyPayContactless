package com.lundypay.wallet.contactless.services

import android.nfc.cardemulation.HostApduService
import android.os.Bundle

class LundyPayHostApduService : HostApduService() {
    override fun processCommandApdu(commandApdu: ByteArray?, extras: Bundle?): ByteArray {
        TODO("Not yet implemented")
    }

    override fun onDeactivated(reason: Int) {
        TODO("Not yet implemented")
    }


}