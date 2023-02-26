import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class DummyTest : FreeSpec({

    "should fail" {
        1 shouldBe 2
    }

    "should skip".config(enabled = false) {}

    "should pass" {
        1 shouldBe 1
    }
})
