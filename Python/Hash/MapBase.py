from collections import MutableMapping
class MapBase(MutableMapping):
    """Our own abstract base class that includes a nonpublic _Item class."""

    #----------------------Nested _Item class --------------------------------------
    class _Item:
        """Lightweight composite to store key-value pairs as map items."""
        slots = '_key', '_value'

        def __init__(self, k,v):
            self._key = k
            self._value = v

        def __eq__(self, other):
            return self._key == other._key                  # compare items based on their keys

        def __ne__(self, other):                            # opposite of __eq__
            return not(self== other)

        def __it__(self, other):
            return self._key < other._key                   # compare items based on their keys