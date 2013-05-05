class ModelCounter

    constructor: ->
        @observers = []
        @value = 1

    increaseValue: (delta) =>
        @value += delta
        @notifyObservers()

    notifyObservers: =>
        obj.notify(this) for obj in @observers

    registerObserver: (observer) =>
        @observers.push(observer)

class ViewCounterButton

    constructor: (opts) ->
        @model_counter = opts.model_counter
        @button_class = opts.button_class or 'button_counter'
        @model_counter.registerObserver(this)

    render: =>
        elm = $("<button class=\"#{@button_class}\">
                #{@model_counter.value}</button>")
        elm.click =>
            @model_counter.increaseValue(1)
        return elm

    notify: =>
        $("button.#{@button_class}").replaceWith(=> @render())